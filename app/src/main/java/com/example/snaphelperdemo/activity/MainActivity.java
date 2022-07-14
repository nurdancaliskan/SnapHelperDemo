package com.example.snaphelperdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ViewUtils;
import androidx.recyclerview.widget.LinearSnapHelper;

import android.os.Bundle;
import android.util.Log;


import com.example.snaphelperdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ActivityMainBinding binding;
    int scrollIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        initUI();
        setContentView(binding.getRoot());

        binding.bContinue.setOnClickListener(view ->
        {
            scrollIndex += 1;
            if (scrollIndex > 2) scrollIndex = 0;
            updateTexts(scrollIndex);
        });
    }

    private void updateTexts(int index) {
        Log.d(TAG, "updateTexts() called with: index = [" + index + "]");
        if (index == 0) {
            Log.d(TAG, "updateTexts() called with: 0");
            binding.tTitle.setText("Hello");
            binding.scrollView.animate()
                    .translationX(0f)
                    .setDuration(250L)
                    .setStartDelay(0)
                    .start();
        }
        if (index == 1) {
            Log.d(TAG, "updateTexts() called with: 1");
            binding.tTitle.setText("Hi");
            binding.scrollView.animate()
                    .translationX(ViewUtils.convertDpToPx(25f))
                    .setDuration(250L)
                    .setStartDelay(0)
                    .start();
        }
        if (index == 2) {
            Log.d(TAG, "updateTexts() called with: 2");
            binding.tTitle.setText("Hola");
            binding.scrollView.animate()
                    .translationX(ViewUtils.convertDpToPx(50f))
                    .setDuration(250L)
                    .setStartDelay(0)
                    .start();
        }
    }

    private void initUI() {
    }

}