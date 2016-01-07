package edu.berkeley.eecs.cfc_tracker.wrapper;

/**
 * Created by shankari on 7/5/15.
 */

public class Metadata {
    public float getWrite_ts() {
        return write_ts;
    }

    public void setWrite_ts(float write_ts) {
        this.write_ts = write_ts;
    }

    public float getRead_ts() {
        return read_ts;
    }

    public void setRead_ts(float read_ts) {
        this.read_ts = read_ts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public void setTimeZone(String timeZone) { this.time_zone = timeZone; }

    public String getTimeZone() { return time_zone; }


    private float write_ts;
    private float read_ts;
    private String time_zone;
    private String type;
    private String key;
    private String plugin;
    private final String platform = "android";

    public Metadata() {
    }
}
