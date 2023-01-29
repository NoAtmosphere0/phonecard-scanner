package com.example.naptiendt;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.vision.text.TextRecognizer;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

import androidx.camera.core.ImageAnalysis;

public class MainActivity extends AppCompatActivity {

    //UI Views
    private MaterialButton inputImageButton;
    private MaterialButton recognizeTextButton;
    private ShapeableImageView imageView;
    private EditText recognizedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize UI Views
        inputImageButton = findViewById(R.id.inputImageButton);
        recognizeTextButton = findViewById(R.id.recognizeTextButton);
        imageView = findViewById(R.id.imageView);
        recognizedTextView = findViewById(R.id.recognizedTextView);

    }
};

