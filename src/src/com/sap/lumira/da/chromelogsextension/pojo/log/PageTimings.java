
package com.sap.lumira.da.chromelogsextension.pojo.log;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class PageTimings {

    @Expose
    private Double onContentLoad;
    @Expose
    private Double onLoad;

    /**
     * 
     * @return
     *     The onContentLoad
     */
    public Double getOnContentLoad() {
        return onContentLoad;
    }

    /**
     * 
     * @param onContentLoad
     *     The onContentLoad
     */
    public void setOnContentLoad(Double onContentLoad) {
        this.onContentLoad = onContentLoad;
    }

    /**
     * 
     * @return
     *     The onLoad
     */
    public Double getOnLoad() {
        return onLoad;
    }

    /**
     * 
     * @param onLoad
     *     The onLoad
     */
    public void setOnLoad(Double onLoad) {
        this.onLoad = onLoad;
    }

}
