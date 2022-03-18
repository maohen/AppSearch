package com.search.appsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    String link = "http://www.google.com/search?q=";
    Uri uri;
    Button btnJs, btnPhp, btnNode, btnCs, btnJava, btnPy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJs = findViewById((R.id.buttonJs));
        btnPhp = findViewById((R.id.buttonPhp));
        btnNode= findViewById((R.id.buttonNode));
        btnCs = findViewById((R.id.buttonCs));
        btnJava = findViewById((R.id.buttonJava));
        btnPy = findViewById((R.id.buttonPython));
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnJs.setOnClickListener((View v)-> hacerBusqueda("Javascript"));
        btnPhp.setOnClickListener((View v)-> hacerBusqueda("Php"));
        btnNode.setOnClickListener((View v)-> hacerBusqueda("Nodejs"));
        btnCs.setOnClickListener((View v)-> hacerBusqueda("Csharp"));
        btnJava.setOnClickListener((View v)-> hacerBusqueda("Java"));
        btnPy.setOnClickListener((View v)-> hacerBusqueda("Python"));
    }

    public void hacerBusqueda(String query){
        uri = Uri.parse(link + query);
        Intent searchJS = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(searchJS);
    }
}