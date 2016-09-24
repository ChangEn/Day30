package com.example.bill.day30;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getScreenInfo();
    }

    private void getScreenInfo(){
        DisplayMetrics dm=getResources().getDisplayMetrics();
        float density=dm.density;
        int dpi=dm.densityDpi;

        int w=dm.widthPixels;
        int h=dm.heightPixels;

        float sd=dm.scaledDensity;

        StringBuilder sb=new StringBuilder();
        sb.append("密度比").append(density).append("\n");
        sb.append("dpi").append(dpi).append("\n");
        sb.append("宽").append(w).append("\n");
        sb.append("高").append(h).append("\n");
        sb.append("字体比").append(sd).append("\n");

        Log.i("info",sb.toString());

    }
}














