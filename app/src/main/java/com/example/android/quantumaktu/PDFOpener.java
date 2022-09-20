package com.example.android.quantumaktu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);
        String getItem = getIntent().getStringExtra("PDFFileName");
        if (getItem.equals("DBMS")) {
            myPDFViewer.fromAsset("Database Management System (Book).pdf").load();
        }
        if (getItem.equals("WEB TECHNOLOGY")) {
            myPDFViewer.fromAsset("Web Technology (Book)_.pdf").load();
        }
        if (getItem.equals("OOS DESIGN")) {
            myPDFViewer.fromAsset("Object Oriented System Design (Book)__2.pdf").load();
        }
        if (getItem.equals("ML TECHNIQUES")) {
            myPDFViewer.fromAsset("Machine Learning Techniques Quantum.pdf").load();
        }
        if (getItem.equals("DAA")) {
            myPDFViewer.fromAsset("Design and Analysis of Algorithm Quantum.pdf").load();
        }

        if (getItem.equals("ITCS")) {
            myPDFViewer.fromAsset("INDIAN  TRADITIONS,  CULTURAL  AND SOCIETY QUANTUM.pdf").load();
        }
        if(getItem.equals("CONSTITUTION_OF_INDIA(संविधान)")){
            myPDFViewer.fromAsset("CONSTITUTION_OF_INDIA_QUANTAM.pdf").load();
        }
    }
}
