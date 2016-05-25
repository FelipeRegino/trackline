package trabalho.trackline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Item extends AppCompatActivity {

    Button bt_locatario, bt_loc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        bt_locatario = (Button) findViewById(R.id.button4);
        bt_locatario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Item.this, Lista_Locatarios.class);
                startActivity(intent1);
            }
        });

        bt_loc = (Button) findViewById(R.id.button5);
        bt_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Item.this, Maps_Location_Track.class);
                startActivity(intent1);
            }
        });
    }
}
