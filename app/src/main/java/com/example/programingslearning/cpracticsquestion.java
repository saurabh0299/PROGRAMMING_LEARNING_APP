package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cpracticsquestion extends AppCompatActivity {
    PDFView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpracticsquestion);


        question=(PDFView)findViewById(R.id.pdfviewer);

        question.fromAsset("cQuestion1.pdf").load();

    }
}
