package com.deneb.trivial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_ocio;
    private Button btn_deportes;
    private Button btn_historia;
    private Button btn_ciencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ocio = (Button) findViewById(R.id.btn_ocio);
        btn_deportes = (Button) findViewById(R.id.btn_deportes);
        btn_ciencia = (Button) findViewById(R.id.btn_ciencia);
        btn_historia = (Button) findViewById(R.id.btn_historia);

        btn_historia.setText(R.string.);




    }
}