package br.com.klauskpm.tourguide.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import br.com.klauskpm.tourguide.fragments.CategoryFragment;
import br.com.klauskpm.tourguide.fragments.CroatiaFragment;
import br.com.klauskpm.tourguide.fragments.IcelandFragment;
import br.com.klauskpm.tourguide.fragments.IrelandFragment;
import br.com.klauskpm.tourguide.fragments.MaltaFragment;
import br.com.klauskpm.tourguide.fragments.MorrocoFragment;

/**
 * Created by Kazlauskas on 03/10/2016.
 */

public class SimpleFragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<CategoryFragment> mFragmentArrayList = new ArrayList<CategoryFragment>();
    private Context mContext;

    public SimpleFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);

        mContext = context;

        mFragmentArrayList.add(new CroatiaFragment());
        mFragmentArrayList.add(new IrelandFragment());
        mFragmentArrayList.add(new IcelandFragment());
        mFragmentArrayList.add(new MorrocoFragment());
        mFragmentArrayList.add(new MaltaFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentArrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getString(mFragmentArrayList.get(position).getTitleResourceId());
    }
}
