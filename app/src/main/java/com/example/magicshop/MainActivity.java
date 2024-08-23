package com.example.magicshop;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> strings;
    List<Ware> inventory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        exampleList();

        inventory = Data.AddData();
        showAdvancedListview();

    }

    void exampleList(){

        strings = new ArrayList<>();
        strings.add("1 string");
        strings.add("2 string");
        strings.add("3 string");
        strings.add("4 string");
        strings.add("5 string");

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        ListView lv = findViewById(R.id.lv_stringlist);
        lv.setAdapter(adapter);
    }

    void showAdvancedListview(){
        WaresAdapter adapter = new WaresAdapter(this, 0, inventory);
        ListView lv = findViewById(R.id.lv_stringlist);
        lv.setAdapter(adapter);
    }

}