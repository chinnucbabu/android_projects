package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button btn, btnn;
    String getName, getPlace, getEmail, getMobile, getUsername, getPassword, getConfirmpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.nm);
        ed2=(EditText)findViewById(R.id.place);
        ed3=(EditText)findViewById(R.id.email);
        ed4=(EditText)findViewById(R.id.mob);
        ed5=(EditText)findViewById(R.id.usr);
        ed6=(EditText)findViewById(R.id.pass);
        ed7=(EditText)findViewById(R.id.cfm);

        btn=(Button)findViewById(R.id.but);
        btnn=(Button)findViewById(R.id.butn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getName=ed1.getText().toString();
                getPlace=ed2.getText().toString();
                getEmail=ed3.getText().toString();
                getMobile=ed4.getText().toString();
                getUsername=ed5.getText().toString();
                getPassword=ed6.getText().toString();
                getConfirmpass=ed7.getText().toString();

                Toast.makeText(getApplicationContext(),getName+" "+getPlace+" "+getEmail+" "+getMobile+" "+getUsername+" "+getPassword+" "+getConfirmpass, Toast.LENGTH_SHORT).show();

            }
        });

        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);

            }
        });
    }
}
