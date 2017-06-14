package com.example.sony.threeactivities;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.radio_1:
                        image.setScaleType(ImageView.ScaleType.CENTER);
                        break;
                    case R.id.radio_2:
                        image.setScaleType(ImageView.ScaleType.FIT_END);
                        break;
                    case R.id.radio_3:
                        image.setScaleType(ImageView.ScaleType.FIT_START);
                        break;
                }
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
