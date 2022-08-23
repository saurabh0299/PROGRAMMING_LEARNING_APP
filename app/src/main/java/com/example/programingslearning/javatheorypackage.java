package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class javatheorypackage extends AppCompatActivity {
    PDFView pack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javatheorypackage);

        pack=(PDFView)findViewById(R.id.pdfviewer);

        pack.fromAsset("JavaPackages.pdf").load();

    }
}
