package com.andro.ijang.basades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Create_Account extends AppCompatActivity {

    public Button SignUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        SignUpButton = (Button) findViewById(R.id.signupbutton);

        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenSignup=new Intent(Create_Account.this,Login_Screen.class);
                startActivity(intenSignup);
                finish();
            }
        });
    }
}
