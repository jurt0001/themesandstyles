package com.sriyanksiddhartha.stylesandthemesdemo;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


/** 
 * Author : Sriyank Siddhartha 
 *
 * Module 2 : Styling Views
 *  
 * 		"BEFORE" demo project
 **/
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView txvGradient = (TextView) findViewById(R.id.txvGradient);
		LinearGradient linearGradient = new LinearGradient(0, 0,
			0, txvGradient.getTextSize(), Color.GREEN, Color.RED, Shader.TileMode.MIRROR);

		txvGradient.getPaint().setShader(linearGradient);
	}
}
