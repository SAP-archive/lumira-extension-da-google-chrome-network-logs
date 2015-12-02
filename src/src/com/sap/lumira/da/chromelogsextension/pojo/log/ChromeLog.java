
package com.sap.lumira.da.chromelogsextension.pojo.log;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class ChromeLog {

    @Expose
    private Log log;

    /**
     * 
     * @return
     *     The log
     */
    public Log getLog() {
        return log;
    }

    /**
     * 
     * @param log
     *     The log
     */
    public void setLog(Log log) {
        this.log = log;
    }

}
