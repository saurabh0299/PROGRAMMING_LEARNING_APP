package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class javatheoryconstractor extends AppCompatActivity {

    PDFView cons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javatheoryconstractor);

        cons=(PDFView)findViewById(R.id.pdfviewer);

        cons.fromAsset("JavaConstructors.pdf").load();

    }
}
