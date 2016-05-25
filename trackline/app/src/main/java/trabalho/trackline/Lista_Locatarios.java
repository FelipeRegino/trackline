package trabalho.trackline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class Lista_Locatarios extends AppCompatActivity {

    ImageButton bt_pesquisa;
    ListView lista_locatarios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__locatarios);

        bt_pesquisa = (ImageButton)findViewById(R.id.imageButton);
        bt_pesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Lista_Locatarios.this, Amostra_Locatario.class);
                startActivity(intent5);
            }
        });


        lista_locatarios = (ListView)findViewById(R.id.listView);

        /*lista_locatarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Lista_Locatarios.this, Item.class);
                startActivity(intent4);
            }
        });*/

    }

}
