package company.buscapadel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuPrincipal extends AppCompatActivity {

    private Button crearBoton;
    private Button buscarBoton;
    private Button perfilBoton;
    private Button crearLigaBoton;

    private String correoSesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        final company.buscapadel.MenuPrincipal local = this;
        crearBoton = (Button) findViewById(R.id.button4);
        buscarBoton = (Button) findViewById(R.id.button5);
        perfilBoton = (Button) findViewById(R.id.button6);
        crearLigaBoton = (Button) findViewById(R.id.button7);
        final Intent crearPartido = new Intent(this, MainActivity.class);
        final Intent buscarPartido = new Intent(this, ListarPartidos.class);
        final Intent verPerfil = new Intent(this, VerPerfil.class);
        final Intent crearLiga = new Intent(this, creacionLigas.class);
        crearPartido.putExtras(bundle);
        buscarPartido.putExtras(bundle);
        verPerfil.putExtras(bundle);
        crearLiga.putExtras(bundle);

        crearBoton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(crearPartido);
            }
        });

        buscarBoton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(buscarPartido);
            }
        });

        perfilBoton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(verPerfil);
            }
        });

        crearLigaBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(crearLiga);
            }
        });
    }
}
