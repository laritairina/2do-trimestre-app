package com.lara.a2dotrim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ingresar extends AppCompatActivity {

    private EditText Usuario;
    private EditText Contraseña;
    private Button INGRESAR;
    private ObjetoUsuario user1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

    Usuario= findViewById(R.id.edit_usuario);
    Contraseña= findViewById(R.id.edit_contraseña);
    INGRESAR= findViewById(R.id.button_ingresar);
    user1= new ObjetoUsuario("Lara Irina","Olmos Berman","43872037", "laralamejor", "laritairina");


    }

    private void login (String user, String password) //son strings nada que ver con las anteriores no te confundas
    {
        if (user1.getNombreusuario().equals(user)) {

            if (user1.getContraseña().equals(password)) {
                Toast.makeText(Ingresar.this, "Ingresado correctamente", Toast.LENGTH_LONG).show();
                Intent intent=
                new Intent (Ingresar.this,MainActivity.class);
                startActivity(intent);//va a arrancar esto
            }

            else {
                Toast.makeText(Ingresar.this, "Contraseña incorrecta", Toast.LENGTH_LONG).show();
            }
        }


    }

}

