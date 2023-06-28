package com.randomcat.app.rest.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Breeds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long id;

    @ManyToMany
    @JoinColumn(name = "id")
    List<Images> images;

    @Column
    private String name;
    @Column
    private String temperament;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }
}
