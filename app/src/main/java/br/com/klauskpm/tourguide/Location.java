package br.com.klauskpm.tourguide;

/**
 * Created by klaus on 04/10/16.
 */

public class Location {
    private String mTitle;
    private double mLongitude;
    private double mLatitude;

    public Location(String mTitle) {
        this.mTitle = mTitle;
    }

    public Location(String mTitle, double mLongitude, double mLatitude) {
        this.mTitle = mTitle;
        this.mLongitude = mLongitude;
        this.mLatitude = mLatitude;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public double getLong() {
        return mLongitude;
    }

    public void setLong(double mLongitude) {
        this.mLongitude = mLongitude;
    }

    public double getLat() {
        return mLatitude;
    }

    public void setLat(double mLatitude) {
        this.mLatitude = mLatitude;
    }

    public String getGeoPosition() {
        return getLat() + "," + getLong();
    }
}
