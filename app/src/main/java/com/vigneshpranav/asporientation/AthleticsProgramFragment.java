package com.vigneshpranav.asporientation;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.List;

public class AthleticsProgramFragment extends Fragment {
    public static View fragment;
    private Button lsathletics;
    private Button msathletics;
    private Button usathletics;
    private Button athleticsportal;
    private ImageButton insta;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.athletics, container, false);

        lsathletics = (Button) fragment.findViewById(R.id.lsa);
        msathletics = (Button) fragment.findViewById(R.id.msa);
        usathletics = (Button) fragment.findViewById(R.id.usa);
        athleticsportal = (Button) fragment.findViewById(R.id.ap);
        insta = (ImageButton) fragment.findViewById(R.id.insta);

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/athleticsaspofficial/");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/athleticsaspofficial/")));
                }
                }
        });

        lsathletics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/athletics/lower-school-sports-and-activities"));
                startActivity(browserIntent);
            }
        });

        msathletics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/athletics/ms-sports-and-activities"));
                startActivity(browserIntent);
            }
        });

        usathletics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/athletics/upper-school-sports-and-activities"));
                startActivity(browserIntent);
            }
        });

        athleticsportal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/parent-portal/activities/"));
                startActivity(browserIntent);
            }
        });



        return fragment;
    }


}