package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etNim, etPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btn_login);
        etPass = findViewById(R.id.et_pass);
        etNim = findViewById(R.id.et_nim);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_login :
                        String nim = etNim.getText().toString();
                        String pass = etPass.getText().toString();

                        if (nim.equals("123180063") && pass.equals("apa")){
                            Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();
                            Intent a = new Intent(MainActivity.this,List.class);
                            startActivity(a);
                            finish();
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Email atau Password Salah", Toast.LENGTH_SHORT).show();

                        }
                }
            }
        });

    }
}
