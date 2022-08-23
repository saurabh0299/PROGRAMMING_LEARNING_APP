package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class javatheoryabstraction extends AppCompatActivity {
    PDFView ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javatheoryabstraction);


        ab=(PDFView)findViewById(R.id.pdfviewer);

        ab.fromAsset("JavaAbstract.pdf").load();

    }
}
