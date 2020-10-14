package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MKm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_km);

        final EditText edtM_prog = (EditText) findViewById(R.id.edtM);
        final EditText edtKm_prog = (EditText) findViewById(R.id.edtKm);
        Button btnConverter_prog = (Button) findViewById(R.id.btnConverter);

        btnConverter_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float m, km;
                m = Float.parseFloat(edtM_prog.getText().toString());
                km = m / 1000;
                edtKm_prog.setText(String.valueOf(km));
            }
        });


    }
}
