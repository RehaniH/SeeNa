package com.example.seena_version02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Spinner size = (Spinner)findViewById(R.id.size);
        Spinner quantity = (Spinner)findViewById(R.id.quantity);
        Spinner colour = (Spinner)findViewById(R.id.colour);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ProductActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sizes));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        size.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(ProductActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.colours));
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        colour.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(ProductActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.quantity));
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        quantity.setAdapter(adapter3);
    }
}
