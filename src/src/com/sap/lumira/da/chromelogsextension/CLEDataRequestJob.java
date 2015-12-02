package com.sap.lumira.da.chromelogsextension;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sap.bi.da.extension.sdk.DAException;
import com.sap.bi.da.extension.sdk.IDAEAcquisitionState;
import com.sap.bi.da.extension.sdk.IDAEDataAcquisitionJob;
import com.sap.bi.da.extension.sdk.IDAEProgress;
import com.sap.lumira.da.chromelogsextension.filter.impl.EntryFieldsFilter;
import com.sap.lumira.da.chromelogsextension.pojo.log.ChromeLog;
import com.sap.lumira.da.chromelogsextension.pojo.log.Entry;
import com.sap.lumira.da.chromelogsextension.utils.CLEConstants;
import com.sap.lumira.da.chromelogsextension.utils.CLEUtils;

/**
 * The data acquisition class. This is more like a log parser which parses the
 * HAR files and produces a CSV
 */
public class CLEDataRequestJob implements IDAEDataAcquisitionJob {

	IDAEAcquisitionState acquisitionState;
	private static EntryFieldsFilter entryFieldsFilter = new EntryFieldsFilter();

	CLEDataRequestJob(IDAEAcquisitionState acquisitionState) {
		this.acquisitionState = acquisitionState;
	}

	@Override
	public File execute(IDAEProgress callback) throws DAException {
		try {
			JsonParser parser = new JsonParser();

			// This builder makes sure the text of response content is not
			// deserialized
			GsonBuilder gsonBuilder = new GsonBuilder().excludeFieldsWithoutExposeAnnotation();
			Gson gson = gsonBuilder.create();

			// Read the path of the folder from the acquisition state
			JsonObject infoJSON = (JsonObject) parser.parse(acquisitionState.getInfo());
			String folderPath = infoJSON.get(CLEConstants.INFO_LOGS_FOLDER).getAsString();

			File[] logFiles = CLEUtils.getAllLogFiles(folderPath);

			// Create a temporary csv file to write
			File outputCsv = File.createTempFile(CLEConstants.OUTPUT_CSV_NAME, CLEConstants.CSV_EXTENSION);
			FileOutputStream fileOutputStream = new FileOutputStream(outputCsv);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
			Writer csvWriter = new BufferedWriter(outputStreamWriter);

			// a list to store each row of objects, before writing it to CSV
			// file
			List<Object> csvRow = new ArrayList<Object>();

			for (File logFile : logFiles) {
				String logData = new String(Files.readAllBytes(logFile.toPath()));

				// The whole log is deserialized
				ChromeLog chromeLog = gson.fromJson(logData, ChromeLog.class);

				// The log file's name is taken as the primary key. It will be
				// appended to each line in the CSV.
				String fileName = CLEUtils.removeExtension(logFile);

				List<Entry> entries = chromeLog.getLog().getEntries();

				// Any changes to the output table need to be done in this for
				// loop. Creating a custom filter for any extra fields would
				// keep this code clean and easy to maintain
				for (Entry entry : entries) {

					csvRow.add(fileName);
					csvRow.addAll(entryFieldsFilter.getFilteredFields(entry));

					csvWriter.write(CLEUtils.convertListToCsvLine(csvRow));
					csvRow.clear();
				}
			}
			csvWriter.close();
			return outputCsv;
		} catch (Exception e) {
			throw new DAException("Data acquisition failed", e);
		}
	}

	@Override
	public void cancel() {
		// Cancel is currently not supported
	}

	@Override
	public void cleanup() {
		// Called once acquisition is complete
	}

}
