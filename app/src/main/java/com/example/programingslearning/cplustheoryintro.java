package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cplustheoryintro extends AppCompatActivity {

    PDFView intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplustheoryintro);


        intro=(PDFView)findViewById(R.id.pdfviewer);

        intro.fromAsset("cplusINTRODUCTION.pdf").load();
    }
}
