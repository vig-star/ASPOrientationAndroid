package com.vigneshpranav.asporientation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

import static butterknife.ButterKnife.findById;

public class ASPOnlineFragment extends Fragment {

    public static View fragment;
    @BindView(R.id.onlineintro) TextView intro;
    @BindView(R.id.onlineinfo1) TextView powerschool;
    @BindView(R.id.onlineinfo2) TextView haiku;
    //@BindView(R.id.onlineinfo3) TextView calendars;
    @BindView(R.id.onlineinfo4) TextView directory;
    @BindView(R.id.onlineinfo5) TextView libraries;
    @BindView(R.id.onlineinfo6) TextView navigator;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.asponline, container, false);
        ButterKnife.bind(this, fragment);

        intro.setMovementMethod(LinkMovementMethod.getInstance());
        powerschool.setMovementMethod(LinkMovementMethod.getInstance());
        haiku.setMovementMethod(LinkMovementMethod.getInstance());
        //calendars.setMovementMethod(LinkMovementMethod.getInstance());
        directory.setMovementMethod(LinkMovementMethod.getInstance());
        libraries.setMovementMethod(LinkMovementMethod.getInstance());
        navigator.setMovementMethod(LinkMovementMethod.getInstance());


        return fragment;
    }

}
