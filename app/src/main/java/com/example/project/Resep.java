package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Resep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep);

        Button prev = (Button) findViewById(R.id.jawabarat);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button next = (Button) findViewById(R.id.Lotek);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Lotek.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button nex = (Button) findViewById(R.id.MieKocok);
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),MieKocok.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button ne = (Button) findViewById(R.id.Asinan);
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Asinan.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button n = (Button) findViewById(R.id.Lontong);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Lontong.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button surabi = (Button) findViewById(R.id.Surabi);
        surabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Surabi.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });



    }
}
