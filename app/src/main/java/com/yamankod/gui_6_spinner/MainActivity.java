package com.yamankod.gui_6_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView secim;
    private Spinner spin;
    private String[] liste = { "Samsung", "HTC", "IPhone", "Nokia", "Sony",
            "Huawei", "BlackBerry", "Motorola", "Lg", "Philips" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gui_spinner);
        secim = (TextView) findViewById(R.id.secim);
        spin = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, liste);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener( new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View v,
                                       int position, long id) {
                secim.setText(liste[position]);
            }
            public void onNothingSelected(AdapterView<?> arg0) {
                secim.setText("");
            }
        });
    }
}
