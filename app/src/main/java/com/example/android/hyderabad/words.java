package com.example.android.hyderabad;

/**
 * Created by lenovo on 6/3/2017.
 */

public class words {
    private String mplace;
    private String maddress;
    private float mrating;
    private int mimg;
    private String mdescription;
    private String mtime;
    private String mcost;
    private String mphone;
    private String murl;
    private float mlatitude;
    private float mlongitude;

    public words(String place, String address, int img, float rating, String description, String time, String cost, String phone, String url, float latitude, float longitude) {
        mplace = place;
        maddress = address;
        mrating = rating;
        mimg = img;
        mdescription = description;
        mtime = time;
        mcost = cost;
        mphone = phone;
        murl = url;
        mlatitude = latitude;
        mlongitude = longitude;
    }

    public String getMplace() {
        return mplace;
    }

    public String getMaddress() {
        return maddress;
    }

    public int getMimg() {
        return mimg;
    }

    public float getMrating() {
        return mrating;
    }

    public String getMdescription() {
        return mdescription;
    }

    public String getMtime() {
        return mtime;
    }

    public String getMcost() {
        return mcost;
    }

    public String getMphone() {
        return mphone;
    }

    public String getMurl() {
        return murl;
    }

    public float getMlatitude() {
        return mlatitude;
    }

    public float getMlongitude() {
        return mlongitude;
    }
}
