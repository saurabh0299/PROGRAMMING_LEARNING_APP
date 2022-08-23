package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cplusintervieq extends AppCompatActivity {
    PDFView object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplusintervieq);


        object=(PDFView)findViewById(R.id.pdfviewer);

        object.fromAsset("cplusinteviewQ.pdf").load();
    }
}
