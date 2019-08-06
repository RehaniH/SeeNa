package com.example.seena_version02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoriesActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }

    public void onClick(View view){
        /*switch (view.getId()){
            case R.id.dresses:*/
                intent = new Intent(this, SpecificCategoryActivity.class);
        /*        break;
        }*/
        startActivity(intent);
    }
}
