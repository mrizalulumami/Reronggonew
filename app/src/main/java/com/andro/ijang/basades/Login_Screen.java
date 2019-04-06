package com.andro.ijang.basades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login_Screen extends AppCompatActivity {
    public Button SignIn;
    public TextView LinkSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        SignIn = (Button) findViewById(R.id.signinlink);
        LinkSignup = (TextView) findViewById(R.id.signuplink);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenSignin=new Intent(Login_Screen.this,HomeActivity_Screen.class);
                startActivity(intenSignin);
                finish();
            }
        });

        LinkSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenSignup=new Intent(Login_Screen.this,Create_Account.class);
                startActivity(intenSignup);
                finish();
            }
        });
    }
}
