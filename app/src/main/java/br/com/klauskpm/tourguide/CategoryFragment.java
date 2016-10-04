package br.com.klauskpm.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class CategoryFragment extends Fragment {
    private int mTitleResourceId;
    protected ArrayList<Location> locationArrayList = new ArrayList<Location>();

    /**
     * Instantiates a new Category fragment.
     */
    public CategoryFragment() {
        // Required empty public constructor
    }

    /**
     * Gets title resource id.
     *
     * @return the title resource id
     */
    public int getTitleResourceId() {
        return mTitleResourceId;
    }

    /**
     * Sets title resource id.
     *
     * @param mTitleResourceId the title resource id
     */
    public void setTitleResourceId(int mTitleResourceId) {
        this.mTitleResourceId = mTitleResourceId;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.simple_list, container, false);

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), R.layout.simple_item,
                locationArrayList);

        ListView simpleList = (ListView) rootView.findViewById(R.id.simple_list);
        assert simpleList != null;
        simpleList.setAdapter(locationAdapter);

        return rootView;
    }

}
