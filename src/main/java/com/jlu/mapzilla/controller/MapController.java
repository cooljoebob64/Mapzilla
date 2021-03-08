package com.jlu.mapzilla.controller;

import com.jlu.mapzilla.model.Location;
import com.jlu.mapzilla.service.MapService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class MapController {

    @Autowired
    private MapService mapService;

    private final Logger logger = LoggerFactory.getLogger(MapController.class);

    @GetMapping("/home")
    public String getDefaultMap(){

        Location location = new Location();
        location.setCity("Dallas");
        location.setState("Texas");
        mapService.addCoordinates(location);
//        System.out.println("New Location: "+location);
        logger.info("New location: {}", location);

        return "index.html";
    }
}
