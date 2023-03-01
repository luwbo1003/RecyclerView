package com.example.ex3;

import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder>{

    private ArrayList<Photo> mphotos = new ArrayList<>();
    Context context;

    private final LayoutInflater mInflater;

    public WordListAdapter(Context context, ArrayList<Photo> photos){
        mInflater  = LayoutInflater.from(context);
        this.mphotos = photos;
        this.context = context;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.photolayout, parent, false);
        return new WordViewHolder(mItemView, this, context);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        Photo mCurrent = mphotos.get(position);

        holder.setId(mCurrent.getId());
        holder.getTv_title().setText(mCurrent.getTittle_photo());
//        Picasso.get().load(mCurrent.getSource_photo()).into(holder.getIv_photo());
        Picasso.get().load(mCurrent.getSource_photo()).resize(300,400).centerCrop().into(holder.getIv_photo());

        ArrayList<String> strDiv = new ArrayList<>();
        strDiv.addAll(Arrays.asList(mCurrent.getDescription_photo().split(" ")));
        if (strDiv.size() <= 10){
            holder.getTv_content().setText(mCurrent.getDescription_photo());
        }else {
            strDiv.subList(10, strDiv.size()).clear();
            String strJoin = String.join(" ", strDiv);
            holder.getTv_content().setText(strJoin + "...");
        }
    }

    @Override
    public int getItemCount() {
        return mphotos.size();
    }
}
