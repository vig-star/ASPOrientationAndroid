package com.vigneshpranav.asporientation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

;


public class PFASAAdapter extends ArrayAdapter<PFASA> {

    public PFASAAdapter(Context context, ArrayList<PFASA> pfasas) {
        super(context, 0, pfasas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        PFASA pfasa = getItem(position);
        View listItemView = convertView;
        // Check if an existing view is being reused, otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.pfasa_item, parent, false);
        }
        // Lookup view for data population
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        TextView info = (TextView) listItemView.findViewById(R.id.info);
        // Populate the data into the template view using the data object
        title.setText(pfasa.getTitle());
        info.setText(pfasa.getInfo());

        return listItemView;






    }
}