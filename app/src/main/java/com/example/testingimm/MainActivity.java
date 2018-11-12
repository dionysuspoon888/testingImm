package com.example.testingimm;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by D on 11/12/2018.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // frag fragS = new frag();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.container,new frag())
                .commit();

    }
}
