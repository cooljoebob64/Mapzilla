package com.jlu.mapzilla.model;

import lombok.Data;

@Data
public class Location {
    private String city;
    private String state;
    private String lat;
    private String lng;

    public Location(){
        this.city = "Shreveport";
        this.state = "LA";
    }
}
