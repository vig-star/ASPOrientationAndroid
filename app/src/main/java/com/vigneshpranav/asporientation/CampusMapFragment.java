package com.vigneshpranav.asporientation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.chrisbanes.photoview.PhotoView;

public class CampusMapFragment extends Fragment {

    public static View fragment;
    //private ImageView map;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.map, container, false);

        /*final ImageView zoom = (ImageView) fragment.findViewById(R.id.mapimg);

        final Animation zoomAnimation = AnimationUtils.loadAnimation(fragment.getContext(), R.anim.zoom);
        zoom.startAnimation(zoomAnimation);

        //map = (ImageView) fragment.findViewById(R.id.mapimg);*/

        PhotoView photoView = (PhotoView) fragment.findViewById(R.id.mapimg);
        photoView.setImageResource(R.drawable.campusmap);

        return fragment;
    }

}
