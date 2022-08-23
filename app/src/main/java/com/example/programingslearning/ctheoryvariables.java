package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ctheoryvariables extends AppCompatActivity {

    PDFView VARIABLE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctheoryvariables);






        VARIABLE=(PDFView)findViewById(R.id.pdfviewer);

        VARIABLE.fromAsset("CVariables.pdf").load();

    }
}
