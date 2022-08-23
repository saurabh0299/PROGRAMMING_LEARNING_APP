package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ctheoryrecursion extends AppCompatActivity {

    PDFView recursion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctheoryrecursion);

        recursion=(PDFView)findViewById(R.id.pdfviewer);

        recursion.fromAsset("CRECURSION.pdf").load();

    }
}