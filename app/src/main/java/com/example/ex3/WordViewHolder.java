package com.example.ex3;

import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView tv_title, tv_content;
    private ImageView iv_photo;
    private int id;
    private Context context;
    public Context getContext() {
        return context;
    }
    public void setContext(Context context) {
        this.context = context;
    }

    public TextView getTv_title() {
        return tv_title;
    }

    public void setTv_title(TextView tv_title) {
        this.tv_title = tv_title;
    }

    public TextView getTv_content() {
        return tv_content;
    }

    public void setTv_content(TextView tv_content) {
        this.tv_content = tv_content;
    }

    public ImageView getIv_photo() {
        return iv_photo;
    }

    public void setIv_photo(ImageView iv_photo) {
        this.iv_photo = iv_photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private final WordListAdapter mAdapter;

    public WordViewHolder(View ItemView, WordListAdapter mAdapter, Context context) {
        super(ItemView);
        //
        tv_content = ItemView.findViewById(R.id.tv_content);
        tv_title = ItemView.findViewById(R.id.tv_title);
        iv_photo = ItemView.findViewById(R.id.iv_photo);
        //
        this.mAdapter = mAdapter;
        this.context = context;
        //
        ItemView.setOnClickListener((this));
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, DetailActivity.class);
        Photo mCurrent = PhotoData.getPhotoFromId(id);
        intent.putExtra("photo", mCurrent);
        context.startActivity(intent);
    }
}
