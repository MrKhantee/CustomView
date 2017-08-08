package com.mrkhantee.customview1;

import android.app.*;
import android.os.*;

// How to draw a circle in Android (onDraw method in View)
// https://alvinalexander.com/android/how-to-draw-circle-in-android-view-ondraw-canvas
public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
		
		setContentView(new CustomView(this));
		setTitle("How to draw a circle in Android (onDraw method in View)");
		
    }
}
