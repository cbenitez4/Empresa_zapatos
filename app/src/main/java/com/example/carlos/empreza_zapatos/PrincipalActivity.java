package com.example.carlos.empreza_zapatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity{

        private EditText cantidad;
        private TextView cajatotal;
        private Spinner combosexo, combotipo, combozapato;
        private String[] sexo;
        private String[] tipo;
        private String[] zapato;
        private ArrayAdapter adaptersexo;
        private ArrayAdapter adaptertipo;
        private ArrayAdapter adapterzapato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cantidad = (EditText)findViewById(R.id.txtcantidad);
        cajatotal = (TextView)findViewById(R.id.txtotal);
        combosexo = (Spinner) findViewById(R.id.cmbsexo);
        combotipo = (Spinner)findViewById(R.id.cmbtipo);

        sexo = this.getResources().getStringArray(R.array.sexo);
        adaptersexo = new ArrayAdapter(this,android.R.layout.simple_list_item_1,sexo);
        combosexo.setAdapter(adaptersexo);

        tipo = this.getResources().getStringArray(R.array.tipo);
        adaptertipo = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tipo);
        combotipo.setAdapter(adaptertipo);

        zapato = this.getResources().getStringArray(R.array.zapato);
        adaptertipo = new ArrayAdapter(this,android.R.layout.simple_list_item_1,zapato);
        combozapato.setAdapter(adapterzapato);


    }
}
