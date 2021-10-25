package cl.isisur.app_nintendo_noticias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForoComunidad extends AppCompatActivity {
    Button btvolver1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foro_comunidad);
        btvolver1 = (Button) findViewById(R.id.btVolver);
        Intent intentuno = new Intent(this,Inicio.class);

        btvolver1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentuno);
            }
        });
    }
}