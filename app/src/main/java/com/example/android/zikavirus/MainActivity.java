package com.example.android.zikavirus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao_oque = (Button) findViewById(R.id.button_01);

        botao_oque.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OqueActivity.class);
                startActivity(intent);
            }
        });

        Button botao_causas = (Button) findViewById(R.id.button_02);

        botao_causas.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CausasActivity.class);
                startActivity(intent);
            }
        });

        Button botao_sintomas = (Button) findViewById(R.id.button_03);

        botao_sintomas.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SintomasActivity.class);
                startActivity(intent);
            }
        });

        Button botao_preucacoes = (Button) findViewById(R.id.button_04);

        botao_preucacoes.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PreActivity.class);
                startActivity(intent);
            }
        });

        Button botao_tratar = (Button) findViewById(R.id.button_05);

        botao_tratar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TratarActivity.class);
                startActivity(intent);
            }
        });
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
