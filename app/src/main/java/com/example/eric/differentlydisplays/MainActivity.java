package com.example.eric.differentlydisplays;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    FragmentManager fm = getFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment = new BlankFragment();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.main_activity, fragment);
        transaction.addToBackStack("pictureFragment");
        transaction.commit();
    }
}
