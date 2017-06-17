package com.example.sony.threeactivities;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    Button goBackButton;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        image = (ImageView) findViewById(R.id.img2);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        final String[] scaleTypeVariants = getResources().getStringArray(R.array.scale_type_variants);
        int id = 0;
        for (String variant: scaleTypeVariants) {
            RadioButton rb = new RadioButton(this);
            rb.setId(id);
            rb.setText(variant);
            radioGroup.addView(rb);
            id++;
        }

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {
                image.setScaleType(ImageView.ScaleType.valueOf(scaleTypeVariants[checkedId]));
            }
        });

        goBackButton = (Button) findViewById(R.id.backFrom2Button);
        goBackButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
