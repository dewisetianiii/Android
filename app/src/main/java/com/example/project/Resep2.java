package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resep2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep2);

        Button prev = (Button) findViewById(R.id.jawatengah);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button next = (Button) findViewById(R.id.LumpiaSemarang);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Lumpia.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button nex = (Button) findViewById(R.id.TempeMendoan);
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),Tempe.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button ne = (Button) findViewById(R.id.NasiLiwet);
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),NasiLiwet.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button n = (Button) findViewById(R.id.SotoKudus);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),SotoKudus.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button nasi = (Button) findViewById(R.id.NasiGandul);
        nasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),NasiGandul.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

    }
}
