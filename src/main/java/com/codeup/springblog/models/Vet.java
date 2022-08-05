package com.codeup.springblog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "veterinarians")
public class Vet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private String name;

    @ManyToMany(mappedBy = "vets")
    private List<Dog> dogs;

    public Vet() {
    }

    public Vet(String name, List<Dog> dogs) {
        this.name = name;
        this.dogs = dogs;
    }

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
}
