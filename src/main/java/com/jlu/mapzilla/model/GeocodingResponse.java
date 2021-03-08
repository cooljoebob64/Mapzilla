package com.jlu.mapzilla.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GeocodingResponse {
    private List<Geocoding> results;
}
