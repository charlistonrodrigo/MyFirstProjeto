package com.example.myfirstprojeto;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intentMain2 = getIntent();
        Bundle parametros = intentMain2.getExtras();
        if (parametros != null) {

            final String n1 = parametros.getString("n1");
            int n2 = parametros.getInt("n2");
            int n3 = parametros.getInt("n3");
            int n4 = parametros.getInt("n4");
            int n5 = parametros.getInt("n5");
            final int n6 = parametros.getInt("n6");
            final int n7 = parametros.getInt("n7");

            final int cont = parametros.getInt("cont");
             final int t;

            int x = parametros.getInt("x");

             t = n2+n3+n4+n5;

            AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
            builder.setMessage("Rua : "+n1+ "\n"+ "Total :"+t+"\n"+ "Seed :"+n6+"\n"+ "Dev. :"+n7+"\n"+"pon. :"+cont ).setTitle("Dado  :").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT,"Rua :"+n1+"\n"+ "Total :"+t+ "\n"+ "Seed :"+n6+"\n"+"Dev. :"+n7+"\n"+"Pon. :"+cont);
                    Intent chooser = Intent.createChooser(i, "Enviar Mensagem");
                    startActivity(chooser);


                }

            })
                    .setNegativeButton("Sair", new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dialog, int which){
                            Main2Activity.this.finish();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
        }
    }
    }

