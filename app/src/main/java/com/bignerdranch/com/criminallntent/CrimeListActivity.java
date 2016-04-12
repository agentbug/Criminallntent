package com.bignerdranch.com.criminallntent;

import android.support.v4.app.Fragment;

/**
 * Created by user on 12/04/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
