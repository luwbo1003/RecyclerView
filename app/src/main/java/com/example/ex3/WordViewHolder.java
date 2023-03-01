package com.example.ex3;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final WordListAdapter mAdapter;

    TextView wordItemView;
    public WordViewHolder(View ItemView, WordListAdapter mAdapter) {
        super(ItemView);
        wordItemView = ItemView.findViewById(R.id.word);
        this.mAdapter = mAdapter;
        ItemView.setOnClickListener((this));
    }

    @Override
    public void onClick(View v) {

    }
}
