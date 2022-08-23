package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ctheoryarray extends AppCompatActivity {

    PDFView array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctheoryarray);



        array=(PDFView)findViewById(R.id.pdfviewer);

        array.fromAsset("CARRAYS.pdf").load();
    }
}
