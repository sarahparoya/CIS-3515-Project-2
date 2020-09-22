package edu.temple.signupform2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity
{


    EditText name;
    EditText email;
    EditText pass;
    EditText passconf;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        name = (EditText) findViewById(R.id.editTextName);
        email = (EditText) findViewById(R.id.editTextEmailAddress);
        pass = (EditText) findViewById(R.id.editTextPass);
        passconf = (EditText) findViewById(R.id.editTextPassConf);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(email.getText().length() == 0 || name.getText().length() == 0 || pass.getText().length() == 0
                    || passconf.getText().length() == 0)
                {
                    Toast.makeText(context, "All fields must be entered!", Toast.LENGTH_LONG).show();
                }
                 else if(!pass.getText().toString().equals(passconf.getText().toString()))
                {
                    Toast.makeText(context, "Passwords are currently not matching!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(context, "Welcome, " + name.getText().toString() + ", to the SignUpForm App!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
 }
