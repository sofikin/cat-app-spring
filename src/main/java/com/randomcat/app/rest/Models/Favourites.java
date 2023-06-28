package com.randomcat.app.rest.Models;

import javax.persistence.*;

@Entity
public class Favourites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long favourites_id;
    @Column
    private String url;

    @Column
    private String image_id;

    public long getFavId() {
        return favourites_id;
    }

    public void setFavId(long favourites_id) {
        this.favourites_id = favourites_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageId() {
        return image_id;
    }

    public void setImageId(String image_id) {
        this.image_id = image_id;
    }
}
