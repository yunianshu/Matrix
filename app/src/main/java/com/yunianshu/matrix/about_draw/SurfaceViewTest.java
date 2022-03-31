package com.yunianshu.matrix.about_draw;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.yunianshu.matrix.R;
import com.yunianshu.matrix.about_draw.fragments.FmDrawingBoard;
import com.yunianshu.matrix.about_draw.fragments.FmSinFuction;


/**
 * Created by Droidroid on 2016/1/21.
 */
public class SurfaceViewTest extends AppCompatActivity {

    private Button btn_sin;
    private Button btn_board;
    private FmSinFuction sinFucFm;
    private FmDrawingBoard boardFm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_surfaceview);
        init();
    }

    private void init() {
        sinFucFm = new FmSinFuction();
        boardFm = new FmDrawingBoard();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.content,boardFm);
        transaction.commit();
        btn_sin = (Button) findViewById(R.id.btn1);
        btn_board = (Button) findViewById(R.id.btn2);
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content,sinFucFm);
                transaction.commit();
            }
        });
        btn_board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content,boardFm);
                transaction.commit();
            }
        });
    }
}
