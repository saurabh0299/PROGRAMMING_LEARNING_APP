package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ctheoryerrorhandling extends AppCompatActivity {
    PDFView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctheoryerrorhandling);

        error=(PDFView)findViewById(R.id.pdfviewer);

        error.fromAsset("CERRORHANDLING.pdf").load();

    }
}
