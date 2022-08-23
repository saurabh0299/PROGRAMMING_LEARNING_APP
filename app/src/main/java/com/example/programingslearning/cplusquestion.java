package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cplusquestion extends AppCompatActivity {
    PDFView q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplusquestion);


        q=(PDFView)findViewById(R.id.pdfviewer);

        q.fromAsset("PRACTICS QUESTION.pdf").load();
    }
}
