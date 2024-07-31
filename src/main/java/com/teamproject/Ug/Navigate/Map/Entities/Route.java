package com.teamproject.Ug.Navigate.Map.Entities;

import jakarta.persistence.*;
import lombok.Data;



public class Route {
    private int source;

    private int destination;

    public Route(){

    }


    public int getSource() {

        return source;
    }

    public void setSource(int source) {

        this.source = source;
    }

    public int getDestination() {

        return destination;
    }

    public void setDestination(int destination) {

        this.destination = destination;
    }






    public Route(int source,int destination){
        this.source =source;
        this.destination =destination;


    }


}

