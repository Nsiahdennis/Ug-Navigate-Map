package com.teamproject.Ug.Navigate.Map.Entities;

import jakarta.persistence.*;
import lombok.Data;
//To display the landmarks
@Entity
@Data
public class Landmark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Location location;

    public Landmark(){

    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Location getLocation() {

        return location;
    }

    public void setLocation(Location location) {

        this.location = location;
    }
    public Landmark(Long id, String name,Location location){
        this.id =id;
        this.name =name;
        this.location =location;
    }
}
