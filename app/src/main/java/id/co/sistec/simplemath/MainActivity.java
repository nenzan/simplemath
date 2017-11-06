package id.co.sistec.simplemath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageButton k_rumus, h_rumus, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        k_rumus = (ImageButton) findViewById(R.id.rumus1);
        h_rumus = (ImageButton) findViewById(R.id.rumus2);
        about = (ImageButton) findViewById(R.id.about);



        actionOnClick();

    }

    private void actionOnClick() {

        k_rumus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, KumpulanRumus.class);
                Toast.makeText(MainActivity.this, "Anda masuk Kumpulan Rumus", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });


        h_rumus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, HitungRumus.class);
                Toast.makeText(MainActivity.this, "Anda masuk Hitung Rumus", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AboutActivity.class);
                Toast.makeText(MainActivity.this, "Anda masuk About", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

    }


}
