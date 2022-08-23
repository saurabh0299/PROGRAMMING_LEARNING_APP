package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cplustheorypoly extends AppCompatActivity {

    PDFView poly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplustheorypoly);


        poly=(PDFView)findViewById(R.id.pdfviewer);

        poly.fromAsset("cplusPolymorphism.pdf").load();
    }
}
