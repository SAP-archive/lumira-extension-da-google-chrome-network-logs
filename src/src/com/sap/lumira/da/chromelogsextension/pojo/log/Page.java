
package com.sap.lumira.da.chromelogsextension.pojo.log;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Page {

    @Expose
    private String startedDateTime;
    @Expose
    private String id;
    @Expose
    private String title;
    @Expose
    private PageTimings pageTimings;

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
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The pageTimings
     */
    public PageTimings getPageTimings() {
        return pageTimings;
    }

    /**
     * 
     * @param pageTimings
     *     The pageTimings
     */
    public void setPageTimings(PageTimings pageTimings) {
        this.pageTimings = pageTimings;
    }

}
