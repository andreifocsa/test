package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ConvertFunction(View button)
    {
        // findViewById("editTextNumber2").text
        double val = 0;
        double rezultatInchtoCm = val * 2.54;
        double rezultatCmToInch = val / 2.54;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Rezultat");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setMessage(val + " cm to " + rezultatInchtoCm + " to inch");
        builder.setNegativeButton("Share", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        Toast toast = Toast.makeText(this,"Eroare Conversie", Toast.LENGTH_SHORT);
        toast.show();
    }
}