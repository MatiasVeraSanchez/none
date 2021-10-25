package cl.isisur.app_nintendo_noticias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Noticias extends AppCompatActivity {
    Button btvolver2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);
        btvolver2 = (Button) findViewById(R.id.btVolver);
        Intent intentUno = new Intent(this,Inicio.class);

        btvolver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentUno);
            }
        });
    }
}