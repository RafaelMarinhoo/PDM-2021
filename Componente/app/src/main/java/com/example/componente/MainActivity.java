package com.example.componente;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvfilmes;
    private EditText nome_filme;
    private Button add_filme;
    private ArrayList<String> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nome_filme = findViewById(R.id.nome_filme);
        this.add_filme = findViewById(R.id.add_filme);
        this.lvfilmes = findViewById(R.id.lvfilmes);

        this.add_filme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionarFilme(v);
            }
        });
    }

    private void adicionarFilme(View view) {
        this.lista.add(this.nome_filme.getText().toString());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, this.lista);
        this.lvfilmes.setAdapter(adapter);

    }

}