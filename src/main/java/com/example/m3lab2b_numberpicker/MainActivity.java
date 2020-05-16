package com.example.m3lab2b_numberpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final NumberPicker numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
    numberPicker.setMinValue(0);
    numberPicker.setMaxValue(10);
  }
}
