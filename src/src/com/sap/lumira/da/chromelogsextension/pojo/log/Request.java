
package com.sap.lumira.da.chromelogsextension.pojo.log;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Request {

    @Expose
    private String method;
    @Expose
    private String url;
    @Expose
    private String httpVersion;
    @Expose
    private List<Header> headers = new ArrayList<Header>();
    
    private List<Object> queryString = new ArrayList<Object>();
    @Expose
    private List<Cooky> cookies = new ArrayList<Cooky>();
    @Expose
    private Long headersSize;
    @Expose
    private Long bodySize;

    /**
     * 
     * @return
     *     The method
     */
    public String getMethod() {
        return method;
    }

    /**
     * 
     * @param method
     *     The method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The httpVersion
     */
    public String getHttpVersion() {
        return httpVersion;
    }

    /**
     * 
     * @param httpVersion
     *     The httpVersion
     */
    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    /**
     * 
     * @return
     *     The headers
     */
    public List<Header> getHeaders() {
        return headers;
    }

    /**
     * 
     * @param headers
     *     The headers
     */
    public void setHeaders(List<Header> headers) {
        this.headers = headers;
    }

    /**
     * 
     * @return
     *     The queryString
     */
    public List<Object> getQueryString() {
        return queryString;
    }

    /**
     * 
     * @param queryString
     *     The queryString
     */
    public void setQueryString(List<Object> queryString) {
        this.queryString = queryString;
    }

    /**
     * 
     * @return
     *     The cookies
     */
    public List<Cooky> getCookies() {
        return cookies;
    }

    /**
     * 
     * @param cookies
     *     The cookies
     */
    public void setCookies(List<Cooky> cookies) {
        this.cookies = cookies;
    }

    /**
     * 
     * @return
     *     The headersSize
     */
    public Long getHeadersSize() {
        return headersSize;
    }

    /**
     * 
     * @param headersSize
     *     The headersSize
     */
    public void setHeadersSize(Long headersSize) {
        this.headersSize = headersSize;
    }

    /**
     * 
     * @return
     *     The bodySize
     */
    public Long getBodySize() {
        return bodySize;
    }

    /**
     * 
     * @param bodySize
     *     The bodySize
     */
    public void setBodySize(Long bodySize) {
        this.bodySize = bodySize;
    }

}
