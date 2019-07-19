package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Provinsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi);

        Button prev = (Button) findViewById(R.id.provinsi);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });


        Button nex = (Button) findViewById(R.id.JawaBarat);
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Resep.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button ne = (Button) findViewById(R.id.JawaTengah);
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Resep2.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button n = (Button) findViewById(R.id.JawaTimur);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Resep3.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button banten = (Button) findViewById(R.id.Banten);
        banten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Resep4.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button yogyakarta = (Button) findViewById(R.id.Yogyakarta);
        yogyakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Resep5.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

    }
}
