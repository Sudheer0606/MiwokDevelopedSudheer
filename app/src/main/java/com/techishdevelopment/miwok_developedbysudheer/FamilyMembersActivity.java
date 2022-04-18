package com.techishdevelopment.miwok_developedbysudheer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Family Member Developed by Sudheer");
        ColorDrawable colorDrawable=new ColorDrawable(getResources().getColor(R.color.green));
        actionBar.setBackgroundDrawable(colorDrawable);

    }
}