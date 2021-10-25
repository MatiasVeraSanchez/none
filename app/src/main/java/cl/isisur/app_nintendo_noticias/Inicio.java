package cl.isisur.app_nintendo_noticias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    Button btCerrar;
    String stUsuario = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Context context = getApplicationContext();
        Bundle intent = this.getIntent().getExtras();
        if(intent !=null)
        {
            stUsuario = intent.getString("nombre");
            Toast.makeText(context, "Bienvenido: "+stUsuario, Toast.LENGTH_SHORT).show();
        }
        btCerrar=(Button) findViewById(R.id.btSalir);
        Intent intentUno = new Intent(this,MainActivity.class);

        btCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentUno);
            }
        });
    }
}