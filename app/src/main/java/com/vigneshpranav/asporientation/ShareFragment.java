package com.vigneshpranav.asporientation;

import android.content.ActivityNotFoundException;
import android.content.Context;
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

public class ShareFragment extends Fragment {
    public static View fragment;
    private Button fb;
    private Button vim;
    private Button twit;
    private Button insta3;
    private Button link;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.share,container,false);
        fb = (Button) fragment.findViewById(R.id.fb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/AmericanSchoolOfParis"));
                startActivity(browserIntent);*/
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/AmericanSchoolOfParis"));
                    intent.setPackage("com.facebook.android");
                    startActivity(intent);
                }catch (Exception e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/AmericanSchoolOfParis")));
                }

            }
        });
        insta3 = (Button) fragment.findViewById(R.id.insta3);
        insta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/americanschoolofparisofficial/"));
                startActivity(browserIntent);
            }
        });
        vim = (Button) fragment.findViewById(R.id.vim);
        vim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vimeo.com/americanschoolofparis/"));
                startActivity(browserIntent);
            }
        });
        twit = (Button) fragment.findViewById(R.id.twit);
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/asparisofficial"));
                startActivity(browserIntent);
            }
        });
        link = (Button) fragment.findViewById(R.id.link);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/american-school-of-paris"));
                startActivity(browserIntent);
            }
        });
        return fragment;

    }


}

