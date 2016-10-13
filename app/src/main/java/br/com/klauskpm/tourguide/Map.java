package br.com.klauskpm.tourguide;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by Kazlauskas on 05/10/2016.
 */
public class Map {
    /**
     * The constant MAP_PACKAGE.
     */
    public static final String MAP_PACKAGE = "com.google.android.apps.maps";

    /**
     * Call intent.
     *
     * @param context     the context
     * @param latitude    the latitude
     * @param longitude   the longitude
     * @param queryString the query string
     */
    public static void callIntent(Context context, double latitude, double longitude,
                                  String queryString) {
        Uri gmmIntentUri = Uri.parse("geo:" + latitude + "," + longitude + "?q=" + queryString);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(MAP_PACKAGE, PackageManager.GET_ACTIVITIES);
            mapIntent.setPackage(MAP_PACKAGE);
        } catch (PackageManager.NameNotFoundException e) {
            Log.d(TAG, "callIntent: No package " + MAP_PACKAGE);
        }

        context.startActivity(mapIntent);
    }
}
