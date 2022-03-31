package com.yunianshu.matrix.about_draw.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.yunianshu.matrix.R;


/**
 * Created by Droidroid on 2016/1/22.
 */
public class FmDrawingBoard extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fm_board,container,false);
        return view;
    }
}
