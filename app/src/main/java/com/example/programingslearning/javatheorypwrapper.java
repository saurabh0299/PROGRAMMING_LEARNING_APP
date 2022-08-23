package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class javatheorypwrapper extends AppCompatActivity {
    PDFView wrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javatheorypwrapper);


        wrapper=(PDFView)findViewById(R.id.pdfviewer);

        wrapper.fromAsset("JavaWrapper .pdf").load();


    }
}
