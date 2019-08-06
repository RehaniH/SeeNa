package com.example.seena_version02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SpecificCategoryActivity extends AppCompatActivity {

    public static final String EXTRA_NAME= "com.example.seena_version02.name";
    public static final String EXTRA_PRICE = "com.example.seena_version02.price";
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_category);
        Intent intent = getIntent();
    }

    public void onClick(View view){

        Intent intent = new Intent(this, ProductActivity.class);
        startActivity(intent);
        //ImageView imageView ;

       /* switch (view.getId()){
            case
        }*/

       //TextView name = findViewById(R.id.)
    }
}
