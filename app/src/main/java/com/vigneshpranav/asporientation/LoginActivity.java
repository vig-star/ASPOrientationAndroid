package com.vigneshpranav.asporientation;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button) findViewById(R.id.login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        if ((SharedPrefer.getNameValue(this) != null)) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else {


            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String namevalue = username.getText().toString();
                    String passvalue = password.getText().toString();

                    if (namevalue.equalsIgnoreCase("")) {
                        Toast.makeText(LoginActivity.this, "Enter Username", Toast.LENGTH_SHORT).show();
                    } else if (passvalue.equalsIgnoreCase("")) {
                        Toast.makeText(LoginActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                    } else if (namevalue.equals("asparis") && passvalue.equals("GXXQ1946")) {
                        SharedPrefer.setNameValue(LoginActivity.this, "u");
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(LoginActivity.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();
                        username.setText("");
                        password.setText("");

                    }


                }
            });
        }
    }
}
