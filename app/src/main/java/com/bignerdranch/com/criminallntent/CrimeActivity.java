package com.bignerdranch.com.criminallntent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){

        return new CrimeFragment();
    }


}
