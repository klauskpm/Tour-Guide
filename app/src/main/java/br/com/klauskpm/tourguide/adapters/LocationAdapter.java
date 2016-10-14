package br.com.klauskpm.tourguide.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import br.com.klauskpm.tourguide.Location;
import br.com.klauskpm.tourguide.Map;
import br.com.klauskpm.tourguide.R;

/**
 * Created by klaus on 04/10/16.
 */
public class LocationAdapter extends ArrayAdapter<Location> {
    /**
     * Instantiates a new Location adapter.
     *
     * @param context   the context
     * @param locations the locations
     */
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rootView = convertView;
        final ViewHolder holder;
        if (rootView == null) {
            rootView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_item, parent, false
            );

            holder = new ViewHolder();
            holder.placeImage = (ImageView) rootView.findViewById(R.id.place_image);
            holder.fakeTitleTextView = (TextView) rootView.findViewById(R.id.got_place_name);
            holder.realTitleTextView = (TextView) rootView.findViewById(R.id.real_life_place_name);
            holder.mapActionButton = (Button) rootView.findViewById(R.id.map_action_button);

            rootView.setTag(holder);
        } else {
            holder = (ViewHolder) rootView.getTag();
        }

        final Location location = getItem(position);
        assert location != null;

        if (location.hasImage()) {
            Picasso.with(getContext()).load(location.getmImageResourceId()).into(holder.placeImage);
        }

        holder.fakeTitleTextView.setText(location.getFakePlaceTitle());
        holder.realTitleTextView.setText(location.getRealPlaceTitle());
        holder.mapActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map.callIntent(getContext(), location.getLat(), location.getLong(),
                        location.getRealPlaceTitle());
            }
        });

        return rootView;
    }

    private class ViewHolder {
        ImageView placeImage;
        TextView fakeTitleTextView;
        TextView realTitleTextView;
        Button mapActionButton;
    }
}
