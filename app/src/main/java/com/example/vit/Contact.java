package com.example.vit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Contact extends AppCompatActivity {
    TextView mob1,mob2,mob3, mob4, mob5, mob6;
    String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Vital Signs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mob1=findViewById(R.id.mob1);
        mob2=findViewById(R.id.mob2);
        mob3=findViewById(R.id.mob3);
        mob4=findViewById(R.id.mob4);
        mob5=findViewById(R.id.mob5);
        mob6=findViewById(R.id.mob6);


        mob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=mob1.getText().toString().trim();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+num));
                startActivity(intent);

            }
        });
        mob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=mob2.getText().toString().trim();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+num));
                startActivity(intent);

            }
        });
        mob3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=mob3.getText().toString().trim();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+num));
                startActivity(intent);

            }
        });
        mob4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=mob3.getText().toString().trim();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+num));
                startActivity(intent);

            }
        });
        mob5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=mob3.getText().toString().trim();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+num));
                startActivity(intent);

            }
        });
        mob6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=mob3.getText().toString().trim();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+num));
                startActivity(intent);

            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() ==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}