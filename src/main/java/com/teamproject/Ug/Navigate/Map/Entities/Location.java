package com.teamproject.Ug.Navigate.Map.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
        // To find the location
public class Location {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private double latitude;
        private double longitude;
        private String descriptions;
        public Location(){

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

        public double getLatitude() {

                return latitude;
        }

        public void setLatitude(double latitude) {

                this.latitude = latitude;
        }

        public double getLongitude() {

                return longitude;
        }

        public void setLongitude(double longitude) {
                this.longitude = longitude;

        }

        public String getDescriptions() {

                return descriptions;
        }

        public void setDescriptions(String descriptions) {

                this.descriptions = descriptions;
        }

        public Location(Long id, String name, double latitude, double longitude , String descriptions){
                this.id = id;
                this.name =name;
                this.latitude =latitude;
                this.longitude =longitude;

        }
}



