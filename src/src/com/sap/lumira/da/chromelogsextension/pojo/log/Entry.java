
package com.sap.lumira.da.chromelogsextension.pojo.log;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Entry {

    @Expose
    private String startedDateTime;
    @Expose
    private Double time;
    @Expose
    private Request request;
    @Expose
    private Response response;
    @Expose
    private Cache cache;
    @Expose
    private Timings timings;
    @Expose
    private String connection;
    @Expose
    private String pageref;

    /**
     * 
     * @return
     *     The startedDateTime
     */
    public String getStartedDateTime() {
        return startedDateTime;
    }

    /**
     * 
     * @param startedDateTime
     *     The startedDateTime
     */
    public void setStartedDateTime(String startedDateTime) {
        this.startedDateTime = startedDateTime;
    }

    /**
     * 
     * @return
     *     The time
     */
    public Double getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(Double time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The request
     */
    public Request getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The request
     */
    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * 
     * @return
     *     The response
     */
    public Response getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * 
     * @return
     *     The cache
     */
    public Cache getCache() {
        return cache;
    }

    /**
     * 
     * @param cache
     *     The cache
     */
    public void setCache(Cache cache) {
        this.cache = cache;
    }

    /**
     * 
     * @return
     *     The timings
     */
    public Timings getTimings() {
        return timings;
    }

    /**
     * 
     * @param timings
     *     The timings
     */
    public void setTimings(Timings timings) {
        this.timings = timings;
    }

    /**
     * 
     * @return
     *     The connection
     */
    public String getConnection() {
        return connection;
    }

    /**
     * 
     * @param connection
     *     The connection
     */
    public void setConnection(String connection) {
        this.connection = connection;
    }

    /**
     * 
     * @return
     *     The pageref
     */
    public String getPageref() {
        return pageref;
    }

    /**
     * 
     * @param pageref
     *     The pageref
     */
    public void setPageref(String pageref) {
        this.pageref = pageref;
    }

}
