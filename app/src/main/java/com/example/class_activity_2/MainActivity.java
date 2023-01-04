package com.example.class_activity_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.class_activity_2.model.Book;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Book> books = new ArrayList<>();;
EditText t1;
    EditText t2;
    EditText t3;
    Switch s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         t1 = findViewById(R.id.editTextTextPersonName);
        t2 = findViewById(R.id.editTextTextPersonName2);
        t3 = findViewById(R.id.editTextTextPersonName3);
         s1 = findViewById(R.id.switch1);

        books.add(new Book("java","sajed",5));
        books.add(new Book("c++","same",8));



    }

    public void btnAdd(View view) {
        if(t1.getText().toString()!="" && t2.getText().toString()!="" && t3.getText().toString()!="" && s1.isChecked()){
            books.add(new Book(t1.getText().toString(),t2.getText().toString(),Integer.parseInt(t3.getText().toString())));
        }

    }


    public void btnSave(View view) {


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        Gson gson = new Gson();
        String bookS = gson.toJson(books);
        editor.putString("DAtA",bookS);
        editor.commit();

        Toast.makeText(this, "Save Data:\n"+bookS, Toast.LENGTH_SHORT).show();

    }
}