package com.ase.ro.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonDog;
    private Button buttonCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonDog=/*(Button)*/findViewById(R.id.btnDog);
        buttonDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDogAct();
            }

        });
        buttonCat=/*(Button)*/findViewById(R.id.btnCat);
        buttonCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCatAct();
            }

        });
    }
    public void openDogAct(){
        Intent intent = new Intent(this,DogAct.class);
        startActivity(intent);
    }
    public void openCatAct(){
        Intent intent = new Intent(this,CatAct.class);
        startActivity(intent);
    }
}