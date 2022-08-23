package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class androidinterviewQ extends AppCompatActivity {
    PDFView Q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidinterview_q);

        Q=(PDFView)findViewById(R.id.pdfviewer);

        Q.fromAsset("INTERVIEWQUESTION.pdf").load();
    }
}
