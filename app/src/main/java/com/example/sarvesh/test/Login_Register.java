package com.example.sarvesh.test;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class Login_Register extends AppCompatActivity {

    private TabLayout layout ;
    private SectionsPageAdapter adapter;
    private  ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__register);
        layout = findViewById(R.id.TabLogin);
        adapter = new SectionsPageAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.container);
        setupViewPage(viewPager);
        viewPager.setAdapter(adapter);
        layout.setupWithViewPager(viewPager);


    }

    public  void setupViewPage(ViewPager viewPager)
    {
        Log.i("TAG", "Called");

        //  SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new LogIn(),"LogIN");
        adapter.addFragment(new SignUp(),"Sign Up");
    }


}
