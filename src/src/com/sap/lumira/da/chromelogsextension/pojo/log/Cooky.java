
package com.sap.lumira.da.chromelogsextension.pojo.log;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Cooky {

	@Expose
	private String name;
	@Expose
	private String value;
	@Expose
	private String path;
	@Expose
	private Object expires;
	@Expose
	private Boolean httpOnly;
	@Expose
	private Boolean secure;

	/**
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * 
	 * @param value
	 *            The value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * 
	 * @return The path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * 
	 * @param path
	 *            The path
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * 
	 * @return The expires
	 */
	public Object getExpires() {
		return expires;
	}

	/**
	 * 
	 * @param expires
	 *            The expires
	 */
	public void setExpires(Object expires) {
		this.expires = expires;
	}

	/**
	 * 
	 * @return The httpOnly
	 */
	public Boolean getHttpOnly() {
		return httpOnly;
	}

	/**
	 * 
	 * @param httpOnly
	 *            The httpOnly
	 */
	public void setHttpOnly(Boolean httpOnly) {
		this.httpOnly = httpOnly;
	}

	/**
	 * 
	 * @return The secure
	 */
	public Boolean getSecure() {
		return secure;
	}

	/**
	 * 
	 * @param secure
	 *            The secure
	 */
	public void setSecure(Boolean secure) {
		this.secure = secure;
	}

}
