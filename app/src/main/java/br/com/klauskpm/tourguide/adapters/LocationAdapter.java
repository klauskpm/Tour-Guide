package br.com.klauskpm.tourguide.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.klauskpm.tourguide.Location;
import br.com.klauskpm.tourguide.R;

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

        TextView fakeTitleTextView = (TextView) listView.findViewById(R.id.item_fake_location_title__text_view);
        fakeTitleTextView.setText(location.getFakePlaceTitle());

        TextView realTitleTextView = (TextView) listView.findViewById(R.id.item_real_location_title__text_view);
        realTitleTextView.setText(location.getRealPlaceTitle());

        return listView;
    }
}
