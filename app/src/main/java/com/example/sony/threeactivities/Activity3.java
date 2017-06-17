package com.example.sony.threeactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    ImageView image;
    Spinner spinner;
    Button goBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        image = (ImageView) findViewById(R.id.img3);
        spinner = (Spinner) findViewById(R.id.spinner);

        final String[] scaleTypeVariants = getResources().getStringArray(R.array.scale_type_variants);

        ArrayAdapter<?> adapter =
                ArrayAdapter.createFromResource(this, R.array.scale_type_variants, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                image.setScaleType(ImageView.ScaleType.valueOf(scaleTypeVariants[i]));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        goBackButton = (Button) findViewById(R.id.backFrom3Button);
        goBackButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
