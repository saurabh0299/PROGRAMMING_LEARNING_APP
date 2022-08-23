package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cplustheorythreading extends AppCompatActivity {

    PDFView thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplustheorythreading);

        thread=(PDFView)findViewById(R.id.pdfviewer);

        thread.fromAsset("cplusMULTITHREADING.pdf").load();

    }
}
