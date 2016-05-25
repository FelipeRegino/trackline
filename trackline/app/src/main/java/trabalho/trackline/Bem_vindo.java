package trabalho.trackline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Bem_vindo extends AppCompatActivity {

    Button bt_locatario, bt_funcoes, bt_localize;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        bt_funcoes = (Button) findViewById(R.id.button3);
        bt_locatario = (Button) findViewById(R.id.button2);
        bt_localize = (Button) findViewById(R.id.button6);
        bt_locatario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Bem_vindo.this, Lista_Locatarios.class);
                startActivity(intent2);
            }
        });

        bt_funcoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Bem_vindo.this, Lista_Itens.class);
                startActivity(intent2);
            }
        });

        bt_localize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Bem_vindo.this, localize.class);
                startActivity(intent2);
            }
        });
    }
}
