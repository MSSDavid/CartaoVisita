package com.example.vaio.testandohelloword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.vaio.testandohelloword.R.id.lista;

public class HelloWord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lista);

        ArrayList<String> listaarray = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, listaarray);
        lista.setAdapter(arrayAdapter);

    }
                private ArrayList<String>  preencherDados(){
                    ArrayList<String> dados = new ArrayList<String>();
                    dados.add("Nome: João Pedro");
                    dados.add("Curso: Engenharia de Software");
                    dados.add("Github: https://github.com/joaopsalgado/CartaoVisita ");
                    dados.add("E-mail: salgadojoaopedro@hotmail.com");
                    return dados;

                }



};

