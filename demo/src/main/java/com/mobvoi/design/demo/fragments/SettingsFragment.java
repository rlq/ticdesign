package com.mobvoi.design.demo.fragments;

import android.os.Bundle;
import com.mobvoi.design.wearable.preference.PreferenceFragment;

import com.ticwear.design.demo.R;

/**
 * Created by tankery on 2/25/16.
 *
 */
public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}