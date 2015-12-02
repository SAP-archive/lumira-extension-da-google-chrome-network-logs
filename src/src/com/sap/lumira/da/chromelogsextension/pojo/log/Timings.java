
package com.sap.lumira.da.chromelogsextension.pojo.log;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Timings {

    @Expose
    private Double blocked;
    @Expose
    private Double dns;
    @Expose
    private Double connect;
    @Expose
    private Double send;
    @Expose
    private Double wait;
    @Expose
    private Double receive;
    @Expose
    private Double ssl;

    /**
     * 
     * @return
     *     The blocked
     */
    public Double getBlocked() {
        return blocked;
    }

    /**
     * 
     * @param blocked
     *     The blocked
     */
    public void setBlocked(Double blocked) {
        this.blocked = blocked;
    }

    /**
     * 
     * @return
     *     The dns
     */
    public Double getDns() {
        return dns;
    }

    /**
     * 
     * @param dns
     *     The dns
     */
    public void setDns(Double dns) {
        this.dns = dns;
    }

    /**
     * 
     * @return
     *     The connect
     */
    public Double getConnect() {
        return connect;
    }

    /**
     * 
     * @param connect
     *     The connect
     */
    public void setConnect(Double connect) {
        this.connect = connect;
    }

    /**
     * 
     * @return
     *     The send
     */
    public Double getSend() {
        return send;
    }

    /**
     * 
     * @param send
     *     The send
     */
    public void setSend(Double send) {
        this.send = send;
    }

    /**
     * 
     * @return
     *     The wait
     */
    public Double getWait() {
        return wait;
    }

    /**
     * 
     * @param wait
     *     The wait
     */
    public void setWait(Double wait) {
        this.wait = wait;
    }

    /**
     * 
     * @return
     *     The receive
     */
    public Double getReceive() {
        return receive;
    }

    /**
     * 
     * @param receive
     *     The receive
     */
    public void setReceive(Double receive) {
        this.receive = receive;
    }

    /**
     * 
     * @return
     *     The ssl
     */
    public Double getSsl() {
        return ssl;
    }

    /**
     * 
     * @param ssl
     *     The ssl
     */
    public void setSsl(Double ssl) {
        this.ssl = ssl;
    }

}
