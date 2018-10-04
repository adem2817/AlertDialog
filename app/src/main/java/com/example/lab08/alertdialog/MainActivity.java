package com.example.lab08.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.buttonGonder);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder  pencere = new AlertDialog.Builder(MainActivity.this);
                pencere.setTitle("Uyarı");
                pencere.setMessage("içeriğiniz kaydedilecektir. Onaylıyor musunuz ? ");
                pencere.setIcon(R.drawable.uyari);

                pencere.setPositiveButton("evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "İçeriğiniz kaydedildi.", Toast.LENGTH_SHORT).show();
                        System.exit(0);
                    }
                });

                pencere.setNegativeButton("hayır", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"kaydedilemedid !",Toast.LENGTH_SHORT).show();
                    }
                });

                pencere.setNeutralButton("iptal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"iptal edildi.",Toast.LENGTH_SHORT).show();

                    }
                });

                pencere.show();
            }
        });


    }
}
