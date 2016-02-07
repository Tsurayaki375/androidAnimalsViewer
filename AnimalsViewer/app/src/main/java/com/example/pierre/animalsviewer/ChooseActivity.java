package com.example.pierre.animalsviewer;

    import android.os.Bundle;
    import android.support.v4.app.FragmentManager;
    import android.support.v4.app.FragmentTransaction;
    import android.support.v7.app.ActionBarActivity;
    import android.support.v7.app.AppCompatActivity;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // create our UI using a fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager.findFragmentById(android.R.id.content) == null) {
            ChooseFragment fragment = ChooseFragment.newInstance();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(android.R.id.content, fragment);
            ft.commit();
        }
        ((AppCompatActivity)this).getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}