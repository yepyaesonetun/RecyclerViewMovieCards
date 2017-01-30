package com.immortal.recyclerviewmoviecards;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ACER on 26/10/2016.
 */

public class SecondActivity extends AppCompatActivity {
    TextView textViewActivityPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textViewActivityPosition = (TextView)findViewById(R.id.textView_activity_position);

        Intent intent = getIntent();
        int position = intent.getIntExtra("ItemPosition",-1);

        textViewActivityPosition.setText("Item position \n"+position+" Clicked!");
    }
}
