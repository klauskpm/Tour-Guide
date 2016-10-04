package br.com.klauskpm.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by klaus on 04/10/16.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Context context, int resource, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.simple_item, parent, false
            );
        }

        final Location location = getItem(position);
        assert location != null;

        TextView titleTextView = (TextView) listView.findViewById(R.id.item_title__text_view);
        titleTextView.setText(location.getTitle());

        TextView locationTextView = (TextView) listView.findViewById(R.id.item_location__text_view);
        locationTextView.setText(location.getGeoPosition());

        return listView;
    }
}
