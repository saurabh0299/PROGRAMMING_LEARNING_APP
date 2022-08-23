package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class atheoryfragment extends AppCompatActivity {

    PDFView frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atheoryfragment);

        frag=(PDFView)findViewById(R.id.pdfviewer);

        frag.fromAsset("FRAGMENT.pdf").load();
    }
}
