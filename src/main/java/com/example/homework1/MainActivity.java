package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String hobbis=new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView2=(TextView) findViewById(R.id.textView4);
        textView2.setVisibility(View.GONE);
    }
    public void add(View view){
        TextView textView2=(TextView) findViewById(R.id.textView4);
        EditText editText=(EditText) findViewById(R.id.editTextTextPersonName2);
        hobbis=hobbis+editText.getText().toString()+"\n";
        textView2.setVisibility(View.VISIBLE);
        textView2.setText(hobbis);
    }
}