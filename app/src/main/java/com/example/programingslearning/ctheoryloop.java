package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ctheoryloop extends AppCompatActivity {

    PDFView loop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctheoryloop);


        loop=(PDFView)findViewById(R.id.pdfviewer);

        loop.fromAsset("CLOOP.pdf").load();

    }
}
