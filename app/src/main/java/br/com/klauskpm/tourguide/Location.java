package br.com.klauskpm.tourguide;

/**
 * Created by klaus on 04/10/16.
 */

public class Location {
    private String mFakePlaceTitle;
    private String mRealPlaceTitle;
    private double mLongitude;
    private double mLatitude;

    public Location(String mFakePlaceTitle, String mRealPlaceTitle) {
        this.mFakePlaceTitle = mFakePlaceTitle;
        this.mRealPlaceTitle = mRealPlaceTitle;
    }

    public Location(String mFakePlaceTitle, String mRealPlaceTitle, double mLongitude, double mLatitude) {
        this.mFakePlaceTitle = mFakePlaceTitle;
        this.mRealPlaceTitle = mRealPlaceTitle;
        this.mLongitude = mLongitude;
        this.mLatitude = mLatitude;
    }

    public String getFakePlaceTitle() {
        return mFakePlaceTitle;
    }

    public void setFakePlaceTitle(String mFakePlaceTitle) {
        this.mFakePlaceTitle = mRealPlaceTitle;
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

    public String getRealPlaceTitle() {
        return mRealPlaceTitle;
    }

    public void setRealPlaceTitle(String mRealPlaceTitle) {
        this.mRealPlaceTitle = mRealPlaceTitle;
    }
}
