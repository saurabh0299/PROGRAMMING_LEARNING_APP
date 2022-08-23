package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cplustheoryencapsulation extends AppCompatActivity {

    PDFView cap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplustheoryencapsulation);



        cap=(PDFView)findViewById(R.id.pdfviewer);

        cap.fromAsset("cplusEncapsulation.pdf").load();
    }
}
