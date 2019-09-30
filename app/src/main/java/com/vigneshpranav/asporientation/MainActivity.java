package com.vigneshpranav.asporientation;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static final String TAG = "MsgFirebaseServ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("MyNotification", "MyNotification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);

        }
        FirebaseMessaging.getInstance().subscribeToTopic("general")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        String msg = "Successful";
                        if (!task.isSuccessful()) {
                            msg = "Failed";
                        }
                        Log.d("Tag", msg);
                        //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });

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


//
//        FirebaseInstanceId.getInstance().getInstanceId()
//                .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<InstanceIdResult> task) {
//                        if (!task.isSuccessful()) {
//                            Log.w(TAG, "getInstanceId failed", task.getException());
//                            return;
//                        }
//
//                        // Get new Instance ID token
//                        String token = task.getResult().getToken();
//
//
//                        // Log and toast
//                        String msg = getString(R.string.msg_token_fmt, token);
//                        Log.d(TAG, msg);
//                        //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
//                    }
//                });
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
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
