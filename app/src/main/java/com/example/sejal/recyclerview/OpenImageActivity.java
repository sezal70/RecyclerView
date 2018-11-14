package com.example.sejal.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class OpenImageActivity extends AppCompatActivity{

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_image);
        imageView=(ImageView)findViewById(R.id.imgOpen);
        Intent intent = getIntent();
//        int icon = intent.getIntExtra("Icon",0);
//        String name = intent.getStringExtra("Name");
        Food food = (Food)intent.getSerializableExtra("food");
        int pos = intent.getIntExtra("position",0);
        imageView.setImageResource(food.getIcon());
        Toast.makeText(OpenImageActivity.this,pos+"\n"+food.getName() , Toast.LENGTH_SHORT).show();

    }



    }

