package com.jagdishchoudhary.bijnistask1part1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;

import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnFragmentInteractionListener, FragmentTwo.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onFragmentInteraction(String msg) {
        FragmentTwo fragmentTwo = (FragmentTwo)getSupportFragmentManager().findFragmentById(R.id.fragmentLower);
        fragmentTwo.updateFragment(msg);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
