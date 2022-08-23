package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class atheoryactivity extends AppCompatActivity {

    PDFView actvity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atheoryactivity);

        actvity=(PDFView)findViewById(R.id.pdfviewer);

        actvity.fromAsset("ACTIVITYS.pdf").load();

    }
}
