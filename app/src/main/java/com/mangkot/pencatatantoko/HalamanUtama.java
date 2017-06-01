package com.mangkot.pencatatantoko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.mangkot.pencatatantoko.R.styleable.View;

public class HalamanUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

    }

    public void reset(View V){
        startActivity(new Intent(HalamanUtama.this, HalamanUtama.class));
    }


}


