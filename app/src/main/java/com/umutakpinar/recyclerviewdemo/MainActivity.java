package com.umutakpinar.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.umutakpinar.recyclerviewdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Eddie","Senior Frontend Developer - UI/UX Designer",R.drawable.eddie));
        people.add(new Person("Stephanie","Native Android Developer",R.drawable.stephanie));
        people.add(new Person("Kevin","Cyber Security Expert - Python Developer",R.drawable.kevin));
        people.add(new Person("Steve","Backend Developer & Software Architect",R.drawable.steve));

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        PersonAdapter personAdapter = new PersonAdapter(people);
        binding.recyclerView.setAdapter(personAdapter);
    }
}