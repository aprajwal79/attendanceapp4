package com.nitap.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.ttv.face.FaceEngine;
import com.ttv.facerecog.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public static Context context;
    public static FaceEngine faceEngine;
    public static int check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this, Objects.toString(check), Toast.LENGTH_SHORT).show();
    }
}