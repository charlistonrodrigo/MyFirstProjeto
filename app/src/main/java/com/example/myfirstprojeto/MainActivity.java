package com.example.myfirstprojeto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                final EditText n1 = (EditText) findViewById(R.id.n1);
                final EditText n2 = (EditText) findViewById(R.id.n2);
                final EditText n3 = (EditText) findViewById(R.id.n3);
                final EditText n4 = (EditText) findViewById(R.id.n4);
                final EditText n5 = (EditText) findViewById(R.id.n5);
                final EditText n6 = (EditText) findViewById(R.id.n6);
                final EditText n7 = (EditText) findViewById(R.id.n7);
                int t,x;
                int cont;

                cont = 0;
                x = 0;

                Intent intentMain = new Intent(getApplicationContext(), Main2Activity.class);
                Bundle parametros = new Bundle();

                parametros.putString("n1", n1.getText().toString());
                
                parametros.putInt("n2", Integer.parseInt(n2.getText().toString()));
                x = Integer.parseInt(n2.getText().toString());
                if(x > 0) {
                    cont++;
                }

                parametros.putInt("n3", Integer.parseInt(n3.getText().toString()));
                x = Integer.parseInt(n3.getText().toString());
                if(x > 0) {
                    cont++;
                }

                parametros.putInt("n4", Integer.parseInt(n4.getText().toString()));
                x = Integer.parseInt(n4.getText().toString());
                if(x > 0) {
                    cont++;
                }

                parametros.putInt("n5", Integer.parseInt(n5.getText().toString()));
                x = Integer.parseInt(n5.getText().toString());
                if(x > 0) {
                    cont++;
                }

                parametros.putInt("n6", Integer.parseInt(n6.getText().toString()));
                parametros.putInt("n7", Integer.parseInt(n7.getText().toString()));

                parametros.putInt("cont", (Integer.valueOf(cont)));

                parametros.putInt("x", (Integer.valueOf(x)));


                intentMain.putExtras(parametros);

                startActivity(intentMain);
            }
        });
    }
}
