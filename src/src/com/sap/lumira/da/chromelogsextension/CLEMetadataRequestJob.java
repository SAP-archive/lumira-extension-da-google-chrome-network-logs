package com.sap.lumira.da.chromelogsextension;

import java.io.File;
import java.nio.file.Files;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sap.bi.da.extension.sdk.DAException;
import com.sap.bi.da.extension.sdk.IDAEAcquisitionState;
import com.sap.bi.da.extension.sdk.IDAEMetadataAcquisitionJob;
import com.sap.bi.da.extension.sdk.IDAEProgress;
import com.sap.lumira.da.chromelogsextension.utils.CLEConstants;

/**
 * Simple metadata acquisition class. No specific changes from the sample DA
 */
class CLEMetadataRequestJob implements IDAEMetadataAcquisitionJob {

	IDAEAcquisitionState acquisitionState;
	private static JsonParser parser = new JsonParser();

	CLEMetadataRequestJob(IDAEAcquisitionState acquisitionState) {
		this.acquisitionState = acquisitionState;
	}

	@Override
	public String execute(IDAEProgress callback) throws DAException {
		try {
			// Read the metadata from input file
			JsonObject infoJSON = (JsonObject) parser.parse(acquisitionState.getInfo());
			File metadataFile = new File(infoJSON.get(CLEConstants.INFO_METADATA).getAsString());
			String metadata = new String(Files.readAllBytes(metadataFile.toPath()));
			return metadata;
		} catch (Exception e) {
			throw new DAException("Metadata acquisition failed", e);
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