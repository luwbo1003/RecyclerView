package com.example.ex3;

import java.io.Serializable;

public class Photo implements Serializable {
    private int id;
    private String source_photo;
    private String tittle_photo;
    private String description_photo;

    public Photo(int id, String source_photo, String tittle_photo, String description_photo) {
        this.id = id;
        this.source_photo = source_photo;
        this.tittle_photo = tittle_photo;
        this.description_photo = description_photo;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource_photo() {
        return source_photo;
    }

    public void setSource_photo(String source_photo) {
        this.source_photo = source_photo;
    }

    public String getTittle_photo() {
        return tittle_photo;
    }

    public void setTittle_photo(String tittle_photo) {
        this.tittle_photo = tittle_photo;
    }

    public String getDescription_photo() {
        return description_photo;
    }


    public void setDescription_photo(String description_photo) {
        this.description_photo = description_photo;
    }
}
