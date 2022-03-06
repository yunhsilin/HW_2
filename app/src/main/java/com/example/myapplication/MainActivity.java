package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById((R.id.show_count));

        ((Button) findViewById(R.id.button_zero)).setBackgroundColor(Color.rgb(156, 156, 156));

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if(mCount % 2 == 0){
            ((Button) view).setBackgroundColor(Color.rgb(225, 56, 200));
        ((Button) view).setTextColor(Color.rgb(50, 55, 100));
        }
        else{
            ((Button) view).setBackgroundColor(Color.rgb(25, 250, 56));
        ((Button) view).setTextColor(Color.rgb(20, 25, 200));
        }
    }

    public void toZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));

        ((Button) view).setBackgroundColor(Color.rgb(225, 56, 56));
        ((Button) view).setTextColor(Color.rgb(25, 255, 56));
    }
}