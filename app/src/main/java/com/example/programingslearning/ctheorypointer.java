package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ctheorypointer extends AppCompatActivity {
    PDFView pointer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctheorypointer);

        pointer=(PDFView)findViewById(R.id.pdfviewer);

        pointer.fromAsset("CPOINTER.pdf").load();

    }
}
