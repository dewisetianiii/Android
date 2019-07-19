package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resep4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep4);

        Button prev = (Button) findViewById(R.id.banten);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button next = (Button) findViewById(R.id.SateBandeng);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),SateBandeng.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });


        Button nex = (Button) findViewById(R.id.SotoKhasBanten);
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),SotoKhasBanten.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });


        Button ne = (Button) findViewById(R.id.AngeunLada);
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),AngeunLada.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button n = (Button) findViewById(R.id.KetanBintul);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),KetanBintul.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });

        Button cucur = (Button) findViewById(R.id.KueCucur);
        cucur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),KueCucur.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });
    }
}
