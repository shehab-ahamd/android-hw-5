package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT ="com.example.application.example.EXTRA_TEXT";
    public static final String EXTRA_NUMBER ="com.example.application.example.EXTRA_NUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ed1 = (EditText) findViewById(R.id.EditText1);
        final EditText ed2 = (EditText) findViewById(R.id.EditText2);
        final EditText ed3 = (EditText) findViewById(R.id.EditText3);
        final EditText ed4 = (EditText) findViewById(R.id.EditText4);
        final EditText ed5 = (EditText) findViewById(R.id.EditText5);

        Button button = findViewById(R.id.enter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first = new Intent(MainActivity.this,activity2.class);

                String user = ed1.getText().toString();

                String user2 = ed2.getText().toString();

                String user3 = ed3.getText().toString();

                String user4 = ed4.getText().toString();

                String user5 = ed5.getText().toString();




                first.putExtra("key1",user);
                first.putExtra("key2",user2);
                first.putExtra("key3",user3);
                first.putExtra("key4",user4);
                first.putExtra("key5",user5);


                startActivity(first);
            }
        });
    }

}