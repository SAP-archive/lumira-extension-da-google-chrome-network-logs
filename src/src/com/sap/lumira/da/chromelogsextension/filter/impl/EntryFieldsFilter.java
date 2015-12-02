package com.sap.lumira.da.chromelogsextension.filter.impl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sap.bi.da.extension.sdk.DAException;
import com.sap.lumira.da.chromelogsextension.filter.IFieldsFilter;
import com.sap.lumira.da.chromelogsextension.pojo.log.Entry;
import com.sap.lumira.da.chromelogsextension.pojo.log.Header;
import com.sap.lumira.da.chromelogsextension.pojo.log.Request;
import com.sap.lumira.da.chromelogsextension.pojo.log.Response;
import com.sap.lumira.da.chromelogsextension.pojo.log.Timings;
import com.sap.lumira.da.chromelogsextension.utils.CLEConstants;
import com.sap.lumira.da.chromelogsextension.utils.CLEUtils;

public class EntryFieldsFilter implements IFieldsFilter<Entry> {

	@Override
	public List<Object> getFilteredFields(Entry entry) throws DAException {

		// Filter out data from the request
		Request request = entry.getRequest();
		String url = request.getUrl();
		// This cleaned URL would be useful as entire URL might be too large
		String cleanedURL = cleanUrl(url);

		// Filter out data form the response
		Response response = entry.getResponse();
		Long status = response.getStatus();
		String contentType = response.getContent().getMimeType();

		// Check if response is compressed. This is primarily provided as an
		// example on how to filter headers
		Header contentEncodingHeader = CLEUtils.getHeaderFromList(response.getHeaders(), CLEConstants.CONTENT_ENCODING);
		int compressed = isResponseCompressed(contentEncodingHeader);

		// Filter out data from the timings
		Timings timings = entry.getTimings();
		Double blockedTime = timings.getBlocked();
		Double waitTime = timings.getWait();
		Double sendTime = timings.getSend();
		Double receiveTime = timings.getReceive();
		Double sslTime = timings.getSsl();
		Double dnsTime = timings.getDns();

		Double totalTime = entry.getTime();
		String requestStartTime = entry.getStartedDateTime();
		String pageRef = entry.getPageref();

		return CLEUtils.createListFromObjects(url, cleanedURL, status, contentType, compressed, blockedTime, waitTime,
				sendTime, receiveTime, sslTime, dnsTime, totalTime, requestStartTime, pageRef);
	}

	/**
	 * @param url
	 *            The request URL to be cleaned
	 * @return Filtered out name of the artifact/end point <br/>
	 *         For eg: <b>http://www.foo.com/test/fav.png?id=0112</b> will
	 *         result in <b>fav.png</b>. </br>
	 *         Will return the url itself, if it is unable to clean it correctly
	 */
	private static String cleanUrl(String url) {

		String cleanedUrl = url;
		Pattern pattern = Pattern.compile(CLEConstants.URL_FILTER_REGEX);
		Matcher matcher = pattern.matcher(url);

		if (matcher.find() && matcher.group(2) != "" && matcher.group(2).length() != 0) {
			cleanedUrl = matcher.group(2);
		}

		return cleanedUrl;
	}

	/**
	 * @param header
	 * @return Whether response is compressed or not
	 */
	private static int isResponseCompressed(Header header) {
		if (header != null) {
			return header.getValue().contains(CLEConstants.GZIP) ? 1 : 0;
		}
		return 0;
	}
}
