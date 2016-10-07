package br.com.klauskpm.tourguide.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.klauskpm.tourguide.Location;
import br.com.klauskpm.tourguide.Map;
import br.com.klauskpm.tourguide.R;

/**
 * Created by klaus on 04/10/16.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView = convertView;
        if (rootView == null) {
            rootView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_item, parent, false
            );
        }

        final Location location = getItem(position);
        assert location != null;

        Log.d("UDACITY", "getView: " + location.getRealPlaceTitle() + " " + location.hasImage());
        if (location.hasImage()) {
            Log.d("UDACITY", "getView: entered");
            ImageView placeImage = (ImageView) rootView.findViewById(R.id.place_image);
            placeImage.setImageResource(location.getmImageResourceId());
        }

        TextView fakeTitleTextView = (TextView) rootView.findViewById(R.id.got_place_name);
        fakeTitleTextView.setText(location.getFakePlaceTitle());

        TextView realTitleTextView = (TextView) rootView.findViewById(R.id.real_life_place_name);
        realTitleTextView.setText(location.getRealPlaceTitle());

        Button mapActionButton = (Button) rootView.findViewById(R.id.map_action_button);
        mapActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAGE", "onItemClick: " + location.getRealPlaceTitle());
                Map.callIntent(getContext(), location.getLat(), location.getLong(),
                        location.getRealPlaceTitle());
            }
        });

        return rootView;
    }
}
