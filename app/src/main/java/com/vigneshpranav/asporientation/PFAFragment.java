package com.vigneshpranav.asporientation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class PFAFragment extends Fragment {

    public static View fragment;
    private TextView gliaison;
    private TextView nliaison;
    private TextView iliaison;
    private Button pfaCE;
    private Button pfaSA;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.pfa, container, false);
        gliaison = (TextView) fragment.findViewById(R.id.pfagl);
        nliaison = (TextView) fragment.findViewById(R.id.pfanl);
        iliaison = (TextView) fragment.findViewById(R.id.pfail);
        pfaCE = (Button) fragment.findViewById(R.id.pface);
        pfaSA = (Button) fragment.findViewById(R.id.pfasa);

        SpannableStringBuilder str = new SpannableStringBuilder(getResources().getString(R.string.PFAGL));
        str.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD), 0, 14, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        gliaison.setText(str);

        SpannableStringBuilder str2 = new SpannableStringBuilder(getResources().getString(R.string.PFANL));
        str2.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD), 0, 21, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        nliaison.setText(str2);

        SpannableStringBuilder str3 = new SpannableStringBuilder(getResources().getString(R.string.PFAIL));
        str3.setSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD), 0, 22, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        iliaison.setText(str3);

        pfaCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asparis.org/our-community/community-events"));
                startActivity(browserIntent);
            }
        });

        pfaSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment.getContext(), PFASAActivity.class);
                startActivity(intent);
            }
        });


        return fragment;
    }

}
