package com.amar.covid19arunachalpradesh.Information;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.amar.covid19arunachalpradesh.R;
import com.squareup.picasso.Picasso;

public class Treatements extends AppCompatActivity {

    ImageView treatementimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatements);

        treatementimg = (ImageView) findViewById(R.id.treatementimg);
        Picasso.with(this).load(R.drawable.treatementreal).fit().into(treatementimg);

    }
}
