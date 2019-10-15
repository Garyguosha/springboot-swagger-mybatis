package com.lamd.dao.entity.thermallmager;

import java.io.Serializable;
import java.util.Date;

public class BseModel implements Serializable {

    private String bsedata_teId;

    private String bsedata_seId;

    private String bsedata_data;

    private Date bsedata_time;

    public String getBsedata_teId() {
        return bsedata_teId;
    }

    public void setBsedata_teId(String bsedata_teId) {
        this.bsedata_teId = bsedata_teId;
    }

    public String getBsedata_seId() {
        return bsedata_seId;
    }

    public void setBsedata_seId(String bsedata_seId) {
        this.bsedata_seId = bsedata_seId;
    }

    public String getBsedata_data() {
        return bsedata_data;
    }

    public void setBsedata_data(String bsedata_data) {
        this.bsedata_data = bsedata_data;
    }

    public Date getBsedata_time() {
        return bsedata_time;
    }

    public void setBsedata_time(Date bsedata_time) {
        this.bsedata_time = bsedata_time;
    }
}
