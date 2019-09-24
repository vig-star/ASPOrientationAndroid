package com.vigneshpranav.asporientation;

import android.content.ActivityNotFoundException;
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
import android.widget.ImageButton;

public class CafFragment extends Fragment {
    public static View fragment;
    private Button cafinfo;
    private Button cafrecharge;
    private Button cafrechargeinstructions;
    private ImageButton insta2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.caf,container,false);
        cafinfo = (Button) fragment.findViewById(R.id.cafinfo);
        cafinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/student-life/cafeteria"));
                startActivity(browserIntent);
            }
        });
        cafrecharge = (Button) fragment.findViewById(R.id.cafrecharge);
        cafrecharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafeteria.asparis.fr/cafeteria/restaucaisse/index.php?action=reappro&soc=10&langue=EN"));
                startActivity(browserIntent);
            }
        });
        cafrechargeinstructions = (Button) fragment.findViewById(R.id.cafinstructions);
        cafrechargeinstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/fs/resource-manager/view/532a7c42-8a0a-4413-b8d5-982e2e3ff96e"));
                startActivity(browserIntent);
            }
        });
        insta2 = (ImageButton) fragment.findViewById(R.id.insta2);
        insta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/cafeteria_asp/");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/cafeteria_asp/")));
                }
            }
        });

        return fragment;

    }

}

