package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText ed1, ed2;
    Button bt1, bt2;
    String getUsername, getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ed1=(EditText)findViewById(R.id.un);
        ed2=(EditText)findViewById(R.id.pass);

        bt1=(Button)findViewById(R.id.but);
        bt2=(Button)findViewById(R.id.butn);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getUsername=ed1.getText().toString();
                getPassword=ed2.getText().toString();

                if(getUsername.equals("admin")& getPassword.equals("12345"))
                {
                    Intent i= new Intent(getApplicationContext(),WelcomeActivity.class);
                    startActivity(i);
                }

                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid username or password",Toast.LENGTH_SHORT).show();
                }

                //Toast.makeText(getApplicationContext(),getUsername+ " " + getPassword, Toast.LENGTH_SHORT).show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);



               // Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
