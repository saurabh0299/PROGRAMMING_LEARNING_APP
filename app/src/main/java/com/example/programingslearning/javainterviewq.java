package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class javainterviewq extends AppCompatActivity {

    PDFView interview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javainterviewq);

        interview=(PDFView)findViewById(R.id.pdfviewer);

        interview.fromAsset("JAVAINTERVIEWQ.pdf").load();


    }
}
