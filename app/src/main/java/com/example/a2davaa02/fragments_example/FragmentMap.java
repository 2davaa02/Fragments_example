package com.example.a2davaa02.fragments_example;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a2davaa02.frangments_example.R;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

/**
 * Created by 2davaa02 on 27/04/2017.
 */
public class FragmentMap extends Fragment
{
    MapView mv;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Activity activity=getActivity();
        Configuration.getInstance().load(activity, PreferenceManager.getDefaultSharedPreferences(activity));

        mv = (MapView)activity.findViewById(R.id.map1);

        mv.setBuiltInZoomControls(true);
        mv.getController().setZoom(14);
        mv.getController().setCenter(new GeoPoint(51.05,-0.72));
    }

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView (LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragmentmap, parent);
    }

    public void SetLocation(double lat,double lon)
    {
        mv.getController().setCenter(new GeoPoint(lat,lon));

    }
}
