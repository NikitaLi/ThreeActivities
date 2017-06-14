package com.example.sony.threeactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String[] choose = getResources().getStringArray(R.array.spinner_entries);
                switch (choose[i]) {
                    case "CENTER":
                        image.setScaleType(ImageView.ScaleType.CENTER);
                        break;
                    case "FIT_END":
                        image.setScaleType(ImageView.ScaleType.FIT_END);
                        break;
                    case "FIT_START":
                        image.setScaleType(ImageView.ScaleType.FIT_START);
                        break;
                }
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
