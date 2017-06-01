package com.mangkot.pencatatantoko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import static com.mangkot.pencatatantoko.R.id.editText;
import static com.mangkot.pencatatantoko.R.id.editText7;
import static com.mangkot.pencatatantoko.R.styleable.View;

public class HalamanUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

    }

    public void reset(View V) {

        Intent intent = getIntent();
        overridePendingTransition(0, 0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();

        overridePendingTransition(0, 0);
        startActivity(intent);
    }

    public void input(View v){
        final EditText nameField = (EditText) findViewById(R.id.editText7);
        String nama = nameField.getText().toString();

        final EditText kuantitasField = (EditText) findViewById(R.id.editText13);
        String kuantitas = kuantitasField.getText().toString();

        final EditText pemasokField = (EditText) findViewById(R.id.editText8);
        String pemasok = pemasokField.getText().toString();

        final Spinner tglField = (Spinner) findViewById(R.id.datePicker);
        String tgl = tglField.getSelectedItem().toString();
        
    }

}


