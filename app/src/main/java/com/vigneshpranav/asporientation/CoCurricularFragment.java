package com.vigneshpranav.asporientation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CoCurricularFragment extends Fragment {
    public static View fragment;
    private Button lscca;
    private Button mscca;
    private Button uscca;
    private Button ccaportal;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.cocurricular, container, false);

        lscca = (Button) fragment.findViewById(R.id.lscca);
        mscca = (Button) fragment.findViewById(R.id.mscca);
        uscca = (Button) fragment.findViewById(R.id.uscca);
        ccaportal = (Button) fragment.findViewById(R.id.ccap);

        lscca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/student-life/curricular/lower-school"));
                startActivity(browserIntent);
            }
        });

        mscca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/student-life/curricular/middle-school"));
                startActivity(browserIntent);
            }
        });

        uscca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/student-life/curricular/upper-school"));
                startActivity(browserIntent);
            }
        });

        ccaportal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/parent-portal/activities/clubs"));
                startActivity(browserIntent);
            }
        });



        return fragment;
    }


}