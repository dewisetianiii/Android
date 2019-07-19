package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resep5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep5);

        Button prev = (Button) findViewById(R.id.yogyakarta);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button next = (Button) findViewById(R.id.Gudeg);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Gudeg.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button nex = (Button) findViewById(R.id.Krecek);
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Krecek.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button ne = (Button) findViewById(R.id.NasiTiwul);
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),NasiTiwul.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button n = (Button) findViewById(R.id.SayurLombokIjo);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),SayurLombokIjo.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button ayam = (Button) findViewById(R.id.AyamGeprek);
        ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),AyamGeprek.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });
    }
}
