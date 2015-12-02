package com.sap.lumira.da.chromelogsextension.filter;

import java.util.List;

import com.sap.bi.da.extension.sdk.DAException;

/**
 * An interface to filter out the required fields from the log All
 * implementations will filter out the required fields
 * 
 * @param <T>
 *            The object that will be filtered for the fields
 * 
 */
public interface IFieldsFilter<T> {

	/**
	 * @param objToFilter
	 * @return List of filtered fields
	 * @throws DAException
	 */
	public List<Object> getFilteredFields(T objToFilter) throws DAException;
}
