package com.teamproject.Ug.Navigate.Map.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Location source;
    @ManyToOne
    private Location destination;
    private double distance;
    private double arrivalTime;

    public Route(){

    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Location getSource() {

        return source;
    }

    public void setStartLocation(Location source) {

        this.source = source;
    }

    public Location getDestination() {

        return destination;
    }

    public void setDestination(Location destination) {

        this.destination = destination;
    }

    public double getDistance() {

        return distance;
    }

    public void setDistance(double distance) {

        this.distance = distance;
    }

    public double getArrivalTime() {

        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {

        this.arrivalTime = arrivalTime;
    }
    public Route(Long id,Location source,Location destination,double distance,double arrivalTime){
        this.id = id;
        this.source =source;
        this.destination =destination;
        this.distance =distance;
        this.arrivalTime =arrivalTime;



    }


}

