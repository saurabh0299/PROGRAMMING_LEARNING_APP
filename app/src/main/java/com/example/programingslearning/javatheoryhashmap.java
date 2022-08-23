package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class javatheoryhashmap extends AppCompatActivity {

    PDFView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javatheoryhashmap);

        map=(PDFView)findViewById(R.id.pdfviewer);

        map.fromAsset("JavaHashMap.pdf").load();

    }
}
