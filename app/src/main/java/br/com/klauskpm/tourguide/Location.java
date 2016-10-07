package br.com.klauskpm.tourguide;

/**
 * Created by klaus on 04/10/16.
 */
public class Location {
    private String mFakePlaceTitle;
    private String mRealPlaceTitle;
    private double mLongitude;
    private double mLatitude;
    private int mImageResourceId = UNDEFINED_IMAGE;

    private final static int UNDEFINED_IMAGE = -1;

    /**
     * Instantiates a new Location.
     *
     * @param mFakePlaceTitle the fake place title
     * @param mRealPlaceTitle the real place title
     * @param mLongitude      the longitude
     * @param mLatitude       the latitude
     */
    public Location(String mFakePlaceTitle, String mRealPlaceTitle, double mLongitude, double mLatitude) {
        this.mFakePlaceTitle = mFakePlaceTitle;
        this.mRealPlaceTitle = mRealPlaceTitle;
        this.mLongitude = mLongitude;
        this.mLatitude = mLatitude;
    }

    /**
     * Instantiates a new Location.
     *
     * @param mFakePlaceTitle   the fake place title
     * @param mRealPlaceTitle   the real place title
     * @param mLongitude        the longitude
     * @param mLatitude         the latitude
     * @param mImageResourceId  the image resource ID
     */
    public Location(String mFakePlaceTitle, String mRealPlaceTitle, double mLongitude,
                    double mLatitude, int mImageResourceId) {
        this.mFakePlaceTitle = mFakePlaceTitle;
        this.mRealPlaceTitle = mRealPlaceTitle;
        this.mLongitude = mLongitude;
        this.mLatitude = mLatitude;
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * Gets fake place title.
     *
     * @return the fake place title
     */
    public String getFakePlaceTitle() {
        return mFakePlaceTitle;
    }

    /**
     * Sets fake place title.
     *
     * @param mFakePlaceTitle the fake place title
     */
    public void setFakePlaceTitle(String mFakePlaceTitle) {
        this.mFakePlaceTitle = mRealPlaceTitle;
    }

    /**
     * Gets long.
     *
     * @return the long
     */
    public double getLong() {
        return mLongitude;
    }

    /**
     * Sets long.
     *
     * @param mLongitude the longitude
     */
    public void setLong(double mLongitude) {
        this.mLongitude = mLongitude;
    }

    /**
     * Gets lat.
     *
     * @return the lat
     */
    public double getLat() {
        return mLatitude;
    }

    /**
     * Sets lat.
     *
     * @param mLatitude the latitude
     */
    public void setLat(double mLatitude) {
        this.mLatitude = mLatitude;
    }

    /**
     * Gets geo position.
     *
     * @return the geo position
     */
    public String getGeoPosition() {
        return getLat() + "," + getLong();
    }

    /**
     * Gets real place title.
     *
     * @return the real place title
     */
    public String getRealPlaceTitle() {
        return mRealPlaceTitle;
    }

    /**
     * Sets real place title.
     *
     * @param mRealPlaceTitle the real place title
     */
    public void setRealPlaceTitle(String mRealPlaceTitle) {
        this.mRealPlaceTitle = mRealPlaceTitle;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public boolean hasImage() {
        return this.mImageResourceId != UNDEFINED_IMAGE;
    }
}
