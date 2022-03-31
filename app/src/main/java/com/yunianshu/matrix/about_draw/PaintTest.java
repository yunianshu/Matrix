package com.yunianshu.matrix.about_draw;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;


import com.yunianshu.matrix.R;
import com.yunianshu.matrix.about_draw.adapter.FragmentsAdapter;
import com.yunianshu.matrix.about_draw.fragments.FmBitmapShader;
import com.yunianshu.matrix.about_draw.fragments.FmLinearGradient;
import com.yunianshu.matrix.about_draw.fragments.FmPathEffect;
import com.yunianshu.matrix.about_draw.fragments.FmReflection;
import com.yunianshu.matrix.about_draw.fragments.FmRoundPicture;
import com.yunianshu.matrix.about_draw.fragments.FmScratchCard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Droidroid on 2016/1/21.
 */
public class PaintTest extends AppCompatActivity implements View.OnClickListener{

    private Button circlePic, scratchCard, shader, gradient, reflect, patheffect;
    private ViewPager pager;
    private List<Fragment> frags;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.aty_pen);

        circlePic = (Button) findViewById(R.id.circle_pic);
        scratchCard = (Button) findViewById(R.id.scratch_card);
        shader = (Button) findViewById(R.id.bitmapshader);
        gradient = (Button) findViewById(R.id.gradient);
        reflect = (Button) findViewById(R.id.reflection);
        patheffect = (Button) findViewById(R.id.patheffect);

        pager = (ViewPager) findViewById(R.id.pager);

        frags = new ArrayList<>();
        frags.add(new FmRoundPicture());
        frags.add(new FmScratchCard());
        frags.add(new FmBitmapShader());
        frags.add(new FmLinearGradient());
        frags.add(new FmReflection());
        frags.add(new FmPathEffect());

        FragmentsAdapter adapter = new FragmentsAdapter(getSupportFragmentManager(),frags);
        pager.setAdapter(adapter);

        circlePic.setOnClickListener(this);
        scratchCard.setOnClickListener(this);
        shader.setOnClickListener(this);
        gradient.setOnClickListener(this);
        reflect.setOnClickListener(this);
        patheffect.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.circle_pic:
                pager.setCurrentItem(0);
                break;
            case R.id.scratch_card:
                pager.setCurrentItem(1);
                break;
            case R.id.bitmapshader:
                pager.setCurrentItem(2);
                break;
            case R.id.gradient:
                pager.setCurrentItem(3);
                break;
            case R.id.reflection:
                pager.setCurrentItem(4);
                break;
            case R.id.patheffect:
                pager.setCurrentItem(5);
                break;
        }
    }
}
