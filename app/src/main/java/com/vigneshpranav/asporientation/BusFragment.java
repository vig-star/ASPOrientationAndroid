package com.vigneshpranav.asporientation;

import android.content.ActivityNotFoundException;
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
import android.widget.ImageButton;

public class BusFragment extends Fragment {
    public static View fragment;
    private Button busroutes;
    private Button latebusroutes;
    private Button latelatebusroutes;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.bus,container,false);
        busroutes = (Button) fragment.findViewById(R.id.busr);
        busroutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://resources.finalsite.net/images/v1547043527/asp/fd7nm9pferrxm1uusuuk/BusRoutes_2018-19_1.pdf"));
                startActivity(browserIntent);
            }
        });
        latebusroutes = (Button) fragment.findViewById(R.id.lbusr);
        latebusroutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://resources.finalsite.net/images/v1547043914/asp/vrf3kibqwyc3mtfeuwx6/Latebuses17h15.pdf"));
                startActivity(browserIntent);
            }
        });
        latelatebusroutes = (Button) fragment.findViewById(R.id.llbusr);
        latelatebusroutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://resources.finalsite.net/images/v1547043987/asp/fmh9ix8nnv6rr7ueznze/LateBuses18h30.pdf"));
                startActivity(browserIntent);
            }
        });


        return fragment;

    }

}

