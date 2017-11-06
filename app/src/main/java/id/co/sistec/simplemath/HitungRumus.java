package id.co.sistec.simplemath;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

/**
 * Created by Nenza Nurfirmansyah on 9/1/2017.
 */

public class HitungRumus extends ListActivity {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] daftar = getResources().getStringArray(R.array.bangun_datar);


        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.hitung_rumus, R.id.label1, daftar));
    }
}
