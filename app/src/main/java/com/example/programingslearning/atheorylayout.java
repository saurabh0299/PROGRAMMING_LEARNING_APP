package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class atheorylayout extends AppCompatActivity {

    PDFView layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atheorylayout);

        layout=(PDFView)findViewById(R.id.pdfviewer);

        layout.fromAsset("LAYOUTS.pdf").load();
    }
}
