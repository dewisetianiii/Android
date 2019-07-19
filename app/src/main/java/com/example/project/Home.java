package com.example.project;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener{

    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button next = (Button) findViewById(R.id.Button1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
               Intent MyIntent = new
                       Intent(bebek.getContext(),Provinsi.class ) ;
               startActivityForResult(MyIntent, 0);
            }
        });

        Button nex = (Button) findViewById(R.id.Button2);
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent MyIntent = new
                        Intent(bebek.getContext(),About.class ) ;
                startActivityForResult(MyIntent, 0);
            }
        });
        keluar = (Button) findViewById(R.id.keluar);
        keluar.setOnClickListener(this);
    }
    public void onClick (View clicked){
        switch (clicked.getId()) {
            case R.id.keluar:
                exit();
                break;
        }
    }

    private void exit () {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah kamu benar-benar ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                Home.this.finish();
                            }
                        })
                .setNegativeButton("Tidak", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int arg1) {
                                //TODO Auto-generated method stub
                                dialog.cancel();
                            }
                        }).show();
    }


    }
