package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resep3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep3);


        Button prev = (Button) findViewById(R.id.jawatimur);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button next = (Button) findViewById(R.id.GadoGado);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),GadoGado.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button nex = (Button) findViewById(R.id.SotoLamongan);
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),SotoLamongan.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button ne = (Button) findViewById(R.id.PecelLele);
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),PecelLele.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button n = (Button) findViewById(R.id.RujakSoto);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),RujakSoto.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button sate = (Button) findViewById(R.id.SateMadura);
        sate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),SateMadura.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });
    }
}
