package com.amar.covid19arunachalpradesh.Information;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.amar.covid19arunachalpradesh.R;
import com.squareup.picasso.Picasso;

public class Precation extends AppCompatActivity {

    ImageView precationimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precation);

        precationimg = (ImageView) findViewById(R.id.precautionimg);
        Picasso.with(this).load(R.drawable.precationreal).fit().into(precationimg);

    }
}
