package com.umutakpinar.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.umutakpinar.recyclerviewdemo.databinding.ActivityDetailsBinding;
import com.umutakpinar.recyclerviewdemo.databinding.ActivityMainBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        Person person = (Person) intent.getSerializableExtra("person");
        binding.textViewHeader.setText(person.name);
        binding.textViewInfo.setText(person.info);
        binding.imageView.setImageResource(person.image);
    }
}