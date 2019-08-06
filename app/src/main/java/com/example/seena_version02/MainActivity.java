package com.example.seena_version02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    Intent intent;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick(View view){

        switch (view.getId()){
            case R.id.collection:
                intent = new Intent(this, CategoriesActivity.class);
                break;
            case R.id.bestSellers:
                intent = new Intent(this, SpecificCategoryActivity.class);
               /* fragment = new CategoriesFragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.dresses, fragment);
                ft.commit();*/
               break;
            case R.id.add:
                intent = new Intent(this, AddProductActivity.class);

                break;
            case R.id.offers:
                intent = new Intent(this, SpecificCategoryActivity.class);
                break;
        }

        startActivity(intent);
    }
}
