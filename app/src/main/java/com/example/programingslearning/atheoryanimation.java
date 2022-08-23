package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class atheoryanimation extends AppCompatActivity {

    PDFView ani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atheoryanimation);

        ani=(PDFView)findViewById(R.id.pdfviewer);

        ani.fromAsset("ANIMATION.pdf").load();
    }
}
