package cl.isisur.app_nintendo_noticias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btIniciar;
    EditText etNombre;
    EditText etContrasena;
    String Usuario;
    String Contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btIniciar = (Button) findViewById(R.id.btiniciar);
        etNombre = (EditText) findViewById(R.id.ETCorreo);
        etContrasena = (EditText) findViewById(R.id.ETcontraseña);
        Intent intentUno = new Intent(this,Inicio.class);

        btIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //etNombre.getText().toString();
                //etContrasena.getText().toString();
                intentUno.putExtra("nombre",etNombre.getText().toString());
                intentUno.putExtra("contraseña",etContrasena.getText().toString());
                startActivity(intentUno);
            }
        });
    }
}