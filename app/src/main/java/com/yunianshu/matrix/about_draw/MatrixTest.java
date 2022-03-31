package com.yunianshu.matrix.about_draw;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.yunianshu.matrix.R;
import com.yunianshu.matrix.about_draw.fragments.FmMatrix;

/**
 * Created by Droidroid on 2016/1/21.
 */
public class MatrixTest extends AppCompatActivity {

    private FmMatrix matrixFm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_matrix);
        matrixFm = new FmMatrix();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.content,matrixFm);
        transaction.commit();
    }
}
