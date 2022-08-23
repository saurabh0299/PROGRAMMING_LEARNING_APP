package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cplustheoryoverloading extends AppCompatActivity {
    PDFView over;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplustheoryoverloading);


        over=(PDFView)findViewById(R.id.pdfviewer);

        over.fromAsset("cplusOVERLOADING.pdf").load();

    }
}
