package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ctheoryfunction extends AppCompatActivity {

    PDFView function;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctheoryfunction);

        function=(PDFView)findViewById(R.id.pdfviewer);

        function.fromAsset("CFUNCTION.pdf").load();

    }
    }

