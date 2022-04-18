package com.techishdevelopment.miwok_developedbysudheer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Numbers - Prashant");
        ColorDrawable colorDrawable=new ColorDrawable(getResources().getColor(R.color.yellow));
        actionBar.setBackgroundDrawable(colorDrawable);
        ListView listView=findViewById(R.id.numberList);
        // ArrayList<in>

        ArrayList<Numbers> numbers=new ArrayList<>();
        numbers.add(new Numbers("lutti","one"));
        numbers.add(new Numbers("otiiko ","two"));
        numbers.add(new Numbers("tolookosu ","three"));
        numbers.add(new Numbers("oyyisa ","four"));
        numbers.add(new Numbers("massokka ","five"));
        numbers.add(new Numbers("temmokka ","six"));
        numbers.add(new Numbers("kenekaku ","seven"));
        numbers.add(new Numbers("kawinta ","eight"));
        numbers.add(new Numbers("wo'e ","nine"));
        numbers.add(new Numbers("na'aacha ","ten"));

        NumbersAdapter numbersAdapter=new NumbersAdapter(getApplicationContext(),R.layout.adapter_view_layout,numbers);
        listView.setAdapter(numbersAdapter);


    }
}