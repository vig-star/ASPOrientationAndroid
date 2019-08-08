package com.vigneshpranav.asporientation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PFASAActivity extends AppCompatActivity {

    //private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfasa);

        //title = (TextView) findViewById(R.id.title1);

        ArrayList<PFASA> pfasas = new ArrayList<>(); //creating ArrayList of program objects (includes program name, date, info, and image - put into adapter)

        pfasas.add(new PFASA("PFA Welcome Coffee (Tuesday, September 4)",
                "Being an ASP parent earns you automatic membership in the PFA! Please join us to meet this year's PFA team as well as other parents. We will get to know each other and briefly explore the opportunities for involvement in the school."));
        pfasas.add(new PFASA("Parent Coffees",
                "The PFA, in collaboration with the school divisions, organizes grade-level parent coffees. These gatherings are a chance to meet fellow parents and to discuss topics of interest for each respective grade. School administrators and faculty offer informative presentations with opportunities for questions and discussions."));
        pfasas.add(new PFASA("Sports Boosters",
                "Sports Boosters bring a lot of spirit to ASP as they support the school’s Athletics program through their presence and enthusiasm, by running the food concessions at home games, and through the creation and sale of Rebels spirit wear."));
        pfasas.add(new PFASA("Senior Class Parents",
                "Senior year is a memorable time for the soon-to-be graduates and their parents! The Senior Parents Committee helps plan special activities every year to support the efforts of our hard-working senior students and to celebrate this memorable year. The group raises funds via champagne sales and other activities. They also coordinate graduation announcements, senior photos, monthly treats, senior t-shirts, an award luncheon, and more."));


        PFASAAdapter pfasaAdapter = new PFASAAdapter(this, pfasas);
        final ListView listView = (ListView) findViewById(R.id.listView2);
        listView.setAdapter(pfasaAdapter);


    }
}
