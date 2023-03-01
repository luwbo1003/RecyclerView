package com.example.ex3;

import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder>{

    private LinkedList<String> mWordList = new LinkedList<>();

    private final LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<String> wordList){
        mInflater  = LayoutInflater.from(context);
        this.mWordList = wordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.itemlayout, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);

    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
