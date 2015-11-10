package com.marcioporto.android.ribbit.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.marcioporto.android.ribbit.R;
import com.marcioporto.android.ribbit.ui.FriendsFragment;
import com.marcioporto.android.ribbit.ui.InboxFragment;

import java.util.Locale;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    protected Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

//        switch (position) {
//            case 0:
//                return new FeedFragment();
//            case 1:
//                return new FriendsFragment();
//            case 2:
//                return new InboxFragment();
//            case 3:
//                return new ProfileFragment();
//        }

        switch (position) {
            case 0:
                return new InboxFragment();
            case 1:
                return new FriendsFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
        // return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
//        switch (position) {
//            case 0:
//                return "Feed".toUpperCase(l);
//            case 1:
//                return mContext.getString(R.string.title_section2).toUpperCase(l);
//            case 2:
//                return mContext.getString(R.string.title_section1).toUpperCase(l);
//            case 3:
//                return "Profile".toUpperCase(l);
//        }
        switch (position) {
            case 0:
                return mContext.getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return mContext.getString(R.string.title_section2).toUpperCase(l);
        }
        return null;
    }

    public int getIcon(int position) {

//        switch (position) {
//            case 0:
//                return R.mipmap.ic_home_white_36dp;
//            case 1:
//                return R.mipmap.ic_tab_friends;
//            case 2:
//                return R.mipmap.ic_tab_inbox;
//            case 3:
//                return R.mipmap.ic_person_white_36dp;
//        }

        switch (position) {
            case 0:
                return R.mipmap.ic_tab_inbox;
            case 1:
                return R.mipmap.ic_tab_friends;
        }

        // default return
        return R.mipmap.ic_home_white_36dp;
    }

}