package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ctheorydecision extends AppCompatActivity {
    PDFView  decision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctheorydecision);


        decision=(PDFView)findViewById(R.id.pdfviewer);

        decision.fromAsset("CDECISIONMAKING.pdf").load();

    }
}
