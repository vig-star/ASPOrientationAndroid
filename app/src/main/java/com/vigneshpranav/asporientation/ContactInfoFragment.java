package com.vigneshpranav.asporientation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class ContactInfoFragment extends Fragment {

    public static View fragment;
    private TextView adm, n, ab1, ab2, ab3, st, d1, d2, d3, c1, c2, c3, c4, cc1, cc2, tca, l1, l2, l3, ad1, ad2, pfa;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.contactinfo, container, false);

        adm = (TextView) fragment.findViewById(R.id.ea);
        adm.setText(Html.fromHtml("<a href=\"mailto:admissions@asparis.fr\">admissions@asparis.fr</a>"));
        adm.setMovementMethod(LinkMovementMethod.getInstance());

        n = (TextView) fragment.findViewById(R.id.en);
        n.setText(Html.fromHtml("<a href=\"mailto:nurse@asparis.fr\">nurse@asparis.fr</a>"));
        n.setMovementMethod(LinkMovementMethod.getInstance());

        ab1 = (TextView) fragment.findViewById(R.id.elab);
        ab1.setText(Html.fromHtml("<a href=\"mailto:lsoffice@asparis.fr\">lsoffice@asparis.fr</a>"));
        ab1.setMovementMethod(LinkMovementMethod.getInstance());

        ab2 = (TextView) fragment.findViewById(R.id.emab);
        ab2.setText(Html.fromHtml("<a href=\"mailto:msoffice@asparis.fr\">msoffice@asparis.fr</a>"));
        ab2.setMovementMethod(LinkMovementMethod.getInstance());

        ab3 = (TextView) fragment.findViewById(R.id.euab);
        ab3.setText(Html.fromHtml("<a href=\"mailto:usoffice@asparis.fr\">usoffice@asparis.fr</a>"));
        ab3.setMovementMethod(LinkMovementMethod.getInstance());

        st = (TextView) fragment.findViewById(R.id.est);
        st.setText(Html.fromHtml("<a href=\"mailto:sfaille@asparis.fr\">sfaille@asparis.fr</a>"));
        st.setMovementMethod(LinkMovementMethod.getInstance());

        d1 = (TextView) fragment.findViewById(R.id.eldab);
        d1.setText(Html.fromHtml("<a href=\"mailto:dkerr@asparis.fr\">dkerr@asparis.fr</a>"));
        d1.setMovementMethod(LinkMovementMethod.getInstance());

        d2 = (TextView) fragment.findViewById(R.id.emdab);
        d2.setText(Html.fromHtml("<a href=\"mailto:chelaili@asparis.fr\">chelaili@asparis.fr</a>"));
        d2.setMovementMethod(LinkMovementMethod.getInstance());

        d3 = (TextView) fragment.findViewById(R.id.eudab);
        d3.setText(Html.fromHtml("<a href=\"mailto:ahubbard@asparis.fr\">ahubbard@asparis.fr</a>"));
        d3.setMovementMethod(LinkMovementMethod.getInstance());

        c1 = (TextView) fragment.findViewById(R.id.elcab);
        c1.setText(Html.fromHtml("<a href=\"mailto:jduplessis@asparis.fr\">jduplessis@asparis.fr</a>"));
        c1.setMovementMethod(LinkMovementMethod.getInstance());

        c2 = (TextView) fragment.findViewById(R.id.emcab);
        c2.setText(Html.fromHtml("<a href=\"mailto:asuzzivalli@asparis.fr\">asuzzivalli@asparis.fr</a>"));
        c2.setMovementMethod(LinkMovementMethod.getInstance());

        c3 = (TextView) fragment.findViewById(R.id.eucab);
        c3.setText(Html.fromHtml("<a href=\"mailto:skaram@asparis.fr\">skaram@asparis.fr</a>"));
        c3.setMovementMethod(LinkMovementMethod.getInstance());

        c4 = (TextView) fragment.findViewById(R.id.euc2ab);
        c4.setText(Html.fromHtml("<a href=\"mailto:jkearns@asparis.fr\">jkearns@asparis.fr</a>"));
        c4.setMovementMethod(LinkMovementMethod.getInstance());

        cc1 = (TextView) fragment.findViewById(R.id.eaccab);
        cc1.setText(Html.fromHtml("<a href=\"mailto:jlauck@asparis.fr\">jlauck@asparis.fr</a>"));
        cc1.setMovementMethod(LinkMovementMethod.getInstance());

        cc2 = (TextView) fragment.findViewById(R.id.eaccab2);
        cc2.setText(Html.fromHtml("<a href=\"mailto:mjlowe@asparis.fr\">mjlowe@asparis.fr</a>"));
        cc2.setMovementMethod(LinkMovementMethod.getInstance());
//
        tca = (TextView) fragment.findViewById(R.id.et);
        tca.setText(Html.fromHtml("<a href=\"mailto:ivezina@asparis.fr\">ivezina@asparis.fr</a>"));
        tca.setMovementMethod(LinkMovementMethod.getInstance());
//
        l1 = (TextView) fragment.findViewById(R.id.ellab);
        l1.setText(Html.fromHtml("<a href=\"mailto:mseaver@asparis.fr\">mseaver@asparis.fr</a>"));
        l1.setMovementMethod(LinkMovementMethod.getInstance());

        l2 = (TextView) fragment.findViewById(R.id.ellab2);
        l2.setText(Html.fromHtml("<a href=\"mailto:gjacks@asparis.fr\">gjacks@asparis.fr</a>"));
        l2.setMovementMethod(LinkMovementMethod.getInstance());

        l3 = (TextView) fragment.findViewById(R.id.eulab);
        l3.setText(Html.fromHtml("<a href=\"mailto:mchioini@asparis.fr\">mchioini@asparis.fr</a>"));
        l3.setMovementMethod(LinkMovementMethod.getInstance());
//
        ad1 = (TextView) fragment.findViewById(R.id.eadab);
        ad1.setText(Html.fromHtml("<a href=\"mailto:jkim@asparis.fr\">jkim@asparis.fr</a>"));
        ad1.setMovementMethod(LinkMovementMethod.getInstance());

        ad2 = (TextView) fragment.findViewById(R.id.eadab2);
        ad2.setText(Html.fromHtml("<a href=\"mailto:nsimota@asparis.fr\">nsimota@asparis.fr</a>"));
        ad2.setMovementMethod(LinkMovementMethod.getInstance());
//
        pfa = (TextView) fragment.findViewById(R.id.epfa);
        pfa.setText(Html.fromHtml("<a href=\"mailto:pfapres@asparis.fr\">pfapres@asparis.fr</a>"));
        pfa.setMovementMethod(LinkMovementMethod.getInstance());










        return fragment;


    }

}
