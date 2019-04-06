package com.andro.ijang.basades;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Activity_Voucherinternet extends AppCompatActivity {

    private Spinner spNamen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voucherinternet);

        Button btnBack=(Button)findViewById(R.id.back);
        spNamen = (Spinner) findViewById(R.id.sp_name);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Button btSpinner = (Button) findViewById(R.id.bt_check);
        btSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Selected "+ spNamen.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
