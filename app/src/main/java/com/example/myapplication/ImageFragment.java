package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class ImageFragment extends Fragment {
    private int imageResourceId;
    public ImageFragment(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_image, container, false);
        ImageView imageView = rootView.findViewById(R.id.imageView);
        imageView.setImageResource(imageResourceId);
        return rootView;
    }
}
