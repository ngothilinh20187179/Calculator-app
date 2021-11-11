package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
    }
    private void updateText(String str)
    {
        editText.setText(str);
    }
    public void zeroBtn(View view)
    {
        updateText(getResources().getString(R.string.zero));
    }
    public void oneBtn(View view)
    {
        updateText(getResources().getString(R.string.one));
    }
    public void twoBtn(View view)
    {
        updateText(getResources().getString(R.string.two));
    }
    public void threeBtn(View view)
    {
        updateText(getResources().getString(R.string.three));
    }
    public void fourBtn(View view)
    {
        updateText(getResources().getString(R.string.four));
    }
    public void fiveBtn(View view)
    {
        updateText(getResources().getString(R.string.five));
    }
    public void sixBtn(View view)
    {
        updateText(getResources().getString(R.string.six));
    }
    public void sevenBtn(View view)
    {
        updateText(getResources().getString(R.string.seven));
    }
    public void eightBtn(View view)
    {
        updateText(getResources().getString(R.string.eight));
    }
    public void nineBtn(View view)
    {
        updateText(getResources().getString(R.string.nine));
    }

}