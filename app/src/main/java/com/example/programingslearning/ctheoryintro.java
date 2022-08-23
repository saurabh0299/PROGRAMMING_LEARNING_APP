package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ctheoryintro extends AppCompatActivity {

    PDFView introductionc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctheoryintro);


        introductionc=(PDFView)findViewById(R.id.pdfviewer);

        introductionc.fromAsset("CINTRODUCTION.pdf").load();

    }
}
