package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class androidprojects extends AppCompatActivity {

    PDFView pro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidprojects);

        pro=(PDFView)findViewById(R.id.pdfviewer);

        pro.fromAsset("ANDROIDPROJECTS.pdf").load();
    }
}
