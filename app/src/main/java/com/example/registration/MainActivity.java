package com.example.registration;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void uploading(View view) {

        String FirstName = ((EditText) findViewById(R.id.FirstName)).getText().toString();
        String LastName = ((EditText) findViewById(R.id.LastName)).getText().toString();
        String Email = ((EditText) findViewById(R.id.Email)).getText().toString();

        Toast.makeText(getApplicationContext(),"First Name -  " + FirstName + " \n" + "Last Name -  " + LastName
                + " \n" + "E-Mail -  " + Email + " \n", Toast.LENGTH_LONG).show();

    }
}
