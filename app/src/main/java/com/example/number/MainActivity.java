package com.example.number;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;
    EditText etInput;
    Button bControl;
    TextView chislo;

    Random rnd = new Random();
    int x = rnd.nextInt(101);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = findViewById(R.id.textView);
        etInput = findViewById(R.id.editText);
        bControl = findViewById(R.id.button);
        chislo = findViewById(R.id.chislo);
    }

    public void onClick(View view) {
        try {
            int value = Integer.parseInt(etInput.getText().toString());
            if (value == x) {
                tvInfo.setText(getResources().getString(R.string.hit));
            } else if (value < x) {
                tvInfo.setText(getResources().getString(R.string.behind));
            } else if (value > x) {
                tvInfo.setText(getResources().getString(R.string.ahead));
            }
            if (value > 100 | value < 1) {
                etInput.setText("");
                tvInfo.setText(getResources().getString(R.string.error));
                chislo.setText("");
            }
        } catch (Exception e) {
            System.out.print("Ошибка, заново");
        }
    }

    public void Exit(View view){
        finish();

    }


}



