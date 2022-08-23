package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class androidgooglemap extends AppCompatActivity {
    PDFView google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidgooglemap);

        google=(PDFView)findViewById(R.id.pdfviewer);

        google.fromAsset("GOOGLEMAP.pdf").load();
    }
}
