package com.techishdevelopment.miwok_developedbysudheer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Phrases Developed by Sudheer");
        ColorDrawable colorDrawable=new ColorDrawable(getResources().getColor(R.color.blue));
        actionBar.setBackgroundDrawable(colorDrawable);

    }
}