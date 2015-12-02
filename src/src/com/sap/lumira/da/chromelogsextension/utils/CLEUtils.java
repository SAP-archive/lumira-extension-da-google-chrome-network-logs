package com.sap.lumira.da.chromelogsextension.utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import com.sap.lumira.da.chromelogsextension.pojo.log.Header;
import com.sap.lumira.da.chromelogsextension.pojo.log.Request;
import com.sap.lumira.da.chromelogsextension.pojo.log.Response;

/**
 * Class of various helper functions
 */
public class CLEUtils {

	/**
	 * @param folderPath
	 *            Path of the folder where all the log files are stored
	 * @return List of all files with the .har extension
	 */
	public static File[] getAllLogFiles(String folderPath) {
		File[] logFiles = new File(folderPath).listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(CLEConstants.LOG_FILE_EXTENSION);
			}
		});
		return logFiles;
	}

	/**
	 * @param file
	 * @return File name without the extension
	 */
	public static String removeExtension(File file) {
		String fileName = file.getName();
		return fileName.substring(0, fileName.lastIndexOf("."));
	}

	/**
	 * @param list
	 *            List of objects to be converted to a CSV line
	 * @return CSV line as a String
	 */
	public static String convertListToCsvLine(List<Object> list) {
		return list.toString().replace("[", "").replace("]", "").replace(", ", ",") + "\n";
	}

	/**
	 * @param headerList
	 *            List of headers from either {@link Request} or
	 *            {@link Response}
	 * @param headerName
	 *            The header name that you want to find in the list
	 * @return {@link Header} object if a matching header is found
	 */
	public static Header getHeaderFromList(List<Header> headerList, String headerName) {
		for (Header header : headerList) {
			if (header.getName().contentEquals(headerName)) {
				return header;
			}
		}
		return null;
	}

	/**
	 * @param objects
	 *            Variable number of objects
	 * @return {@link List} of these objects
	 */
	public static List<Object> createListFromObjects(Object... objects) {
		List<Object> listOfObjs = new ArrayList<Object>();
		for (Object object : objects) {
			listOfObjs.add(object);
		}
		return listOfObjs;
	}
}
