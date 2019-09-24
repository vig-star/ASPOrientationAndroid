package com.vigneshpranav.asporientation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://resources.finalsite.net/images/v1566397947/asp/ysrhuri8bq9imqnppzza/MorningandAfternoon340bus.pdf"));
                startActivity(browserIntent);
            }
        });
        latebusroutes = (Button) fragment.findViewById(R.id.lbusr);
        latebusroutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://resources.finalsite.net/images/v1566397935/asp/soqw0ywgssaazsa2rvlm/5157h30buses201920.pdf"));
                startActivity(browserIntent);
            }
        });
        latelatebusroutes = (Button) fragment.findViewById(R.id.llbusr);
        latelatebusroutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://resources.finalsite.net/images/v1566397873/asp/ahat3dpgkljy7uefnnkk/6_30_18h30buses2019201.pdf"));
                startActivity(browserIntent);
            }
        });


        return fragment;

    }

}

