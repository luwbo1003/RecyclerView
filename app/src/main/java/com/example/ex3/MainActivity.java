package com.example.ex3;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PrivateKey;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    private WordListAdapter mAdapter;
    private LinkedList<String> mWordList = new LinkedList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, mWordList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}