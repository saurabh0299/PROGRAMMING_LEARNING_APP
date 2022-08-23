package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class javaprojects extends AppCompatActivity {

    PDFView proj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javaprojects);

        proj=(PDFView)findViewById(R.id.pdfviewer);

        proj.fromAsset("JavaPROJECT.pdf").load();
    }
}
