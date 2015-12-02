
package com.sap.lumira.da.chromelogsextension.pojo.log;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Response {

    @Expose
    private Long status;
    @Expose
    private String statusText;
    @Expose
    private String httpVersion;
    @Expose
    private List<Header> headers = new ArrayList<Header>();
    @Expose
    private List<Cooky> cookies = new ArrayList<Cooky>();
    @Expose
    private Content content;
    @Expose
    private String redirectURL;
    @Expose
    private Long headersSize;
    @Expose
    private Long bodySize;
    @Expose
    private Long _transferSize;

    /**
     * 
     * @return
     *     The status
     */
    public Long getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The statusText
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * 
     * @param statusText
     *     The statusText
     */
    public void setStatusText(String statusText) {
        this.statusText = statusText;
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
     *     The content
     */
    public Content getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(Content content) {
        this.content = content;
    }

    /**
     * 
     * @return
     *     The redirectURL
     */
    public String getRedirectURL() {
        return redirectURL;
    }

    /**
     * 
     * @param redirectURL
     *     The redirectURL
     */
    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
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

    /**
     * 
     * @return
     *     The _transferSize
     */
    public Long get_transferSize() {
        return _transferSize;
    }

    /**
     * 
     * @param _transferSize
     *     The _transferSize
     */
    public void set_transferSize(Long _transferSize) {
        this._transferSize = _transferSize;
    }

}
