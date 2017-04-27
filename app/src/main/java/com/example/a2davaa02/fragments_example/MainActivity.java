package com.example.a2davaa02.fragments_example;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.a2davaa02.frangments_example.R;

public class MainActivity extends AppCompatActivity {

    FragmentMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        map=(FragmentMap)getFragmentManager().findFragmentById(R.id.mapFrag);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {

        if(item.getItemId() == R.id.newyork)
        {
            // react to the menu item being selected...
            map.SetLocation(40.75,-74);
            return true;
        }
        else if(item.getItemId() == R.id.paris)
        {
            // react to the menu item being selected...
            map.SetLocation(48.85,2.34);

            return true;
        }
        else if(item.getItemId() == R.id.london)
        {
            // react to the menu item being selected...
            map.SetLocation(51.51,-0.1);

            return true;
        }
        return false;
    }
}
