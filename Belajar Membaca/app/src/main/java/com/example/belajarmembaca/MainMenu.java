package com.example.belajarmembaca;

import static android.icu.text.ListFormatter.Type.OR;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Button hurufC = (Button) findViewById(R.id.bt_hurufC);
        hurufC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hC = new Intent(MainMenu.this, HurufC.class);
                hC.putExtra("Message", "From Main Menu");
                startActivity(hC);
            }
        });

        Button hurufO1 = (Button) findViewById(R.id.bt_hurufO1);
        hurufO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hO1 = new Intent(MainMenu.this, HurufO.class);
                hO1.putExtra("Message", "From Main Menu");
                startActivity(hO1);
            }
        });

        Button hurufK = (Button) findViewById(R.id.bt_hurufK);
        hurufK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hK = new Intent(MainMenu.this, HurufK.class);
                hK.putExtra("Message", "From Main Menu");
                startActivity(hK);
            }
        });

        Button hurufR = (Button) findViewById(R.id.bt_hurufR);
        hurufR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hR = new Intent(MainMenu.this, HurufR.class);
                hR.putExtra("Message", "From Main Menu");
                startActivity(hR);
            }
        });

        Button hurufO2 = (Button) findViewById(R.id.bt_hurufO2);
        hurufO2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hO2 = new Intent(MainMenu.this, HurufO.class);
                hO2.putExtra("Message", "From Main Menu");
                startActivity(hO2);
            }
        });

    }
}