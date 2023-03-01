package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    ImageView iv_photo2;
    TextView tv_title2, tv_description2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iv_photo2 = findViewById(R.id.iv);
        tv_title2 = findViewById(R.id.tv_title2);
        tv_description2 = findViewById(R.id.tv_des);

        Photo photo = (Photo) getIntent().getSerializableExtra("photo");

        tv_description2.setText(photo.getDescription_photo());
        tv_title2.setText(photo.getTittle_photo());
        Picasso.get().load(photo.getSource_photo()).into(iv_photo2);
    }
}