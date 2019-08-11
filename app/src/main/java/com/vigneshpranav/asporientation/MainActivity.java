package com.vigneshpranav.asporientation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if ((SharedPrefer.getNameValue(this) == null)) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        HomeFragment homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, homeFragment).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {

            HomeFragment homeFragment = new HomeFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, homeFragment).commit();

        } else if (id == R.id.campusmap) {

            CampusMapFragment cmFragment = new CampusMapFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, cmFragment).addToBackStack(null).commit();

        } else if (id == R.id.welcome) {

            WelcomeProgramFragment welcomeProgramFragment = new WelcomeProgramFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, welcomeProgramFragment).commit();

        } else if (id == R.id.pfa) {

            PFAFragment pfaFragment = new PFAFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, pfaFragment).commit();

        } else if (id == R.id.online) {

            ASPOnlineFragment aspOnlineFragment = new ASPOnlineFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, aspOnlineFragment).commit();

        } else if (id == R.id.athletics) {

            AthleticsProgramFragment athleticsProgramFragment = new AthleticsProgramFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, athleticsProgramFragment).commit();


        } else if (id == R.id.cocurricular) {

            CoCurricularFragment coCurricularFragment = new CoCurricularFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, coCurricularFragment).commit();

        } else if (id == R.id.caf) {

            CafFragment cafFragment = new CafFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, cafFragment).commit();

        } else if (id == R.id.bus) {

            BusFragment busFragment = new BusFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, busFragment).commit();

        } else if (id == R.id.calendar) {

            Intent intent = new Intent(this, CalendarActivity.class);
            startActivity(intent);

        } else if (id == R.id.contactinfo) {

            ContactInfoFragment contactInfoFragment = new ContactInfoFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, contactInfoFragment).commit();

        } else if (id == R.id.share) {

            ShareFragment shareFragment = new ShareFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, shareFragment).commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
