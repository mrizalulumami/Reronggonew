package com.andro.ijang.basades.slider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.andro.ijang.basades.R;

public class FragmentSlider extends Fragment {

    private static final String ARG_PARAM2 = "params";
    private String imageUrl;

    public FragmentSlider(){

    }
    /*public  static FragmentSlider newInstance(String params){
        FragmentSlider fragmen=new FragmentSlider();
        Bundle args=new Bundle();
        args.putString(ARG_PARAM2,params);
        fragmen.setArguments(args);
        return fragmen;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        imageUrl = getArguments().getString(ARG_PARAM2);
        View view=inflater.inflate(R.layout.fragment_slideritem,container,false);
        ImageView image=(ImageView)view.findViewById(R.id.img);
        Slide.with(getActivity())
                .load(imageUrl)
                .placeholder(R.drawable.image_Slider1)
                .into(img);
        return view;
    }*/


}
