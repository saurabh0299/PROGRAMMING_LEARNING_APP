package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class atheorydatabse extends AppCompatActivity {
    PDFView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atheorydatabse);
        data=(PDFView)findViewById(R.id.pdfviewer);

        data.fromAsset("DATABSE.pdf").load();
    }
}
