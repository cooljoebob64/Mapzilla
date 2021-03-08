package com.jlu.mapzilla.controller;

import com.jlu.mapzilla.model.Location;
import com.jlu.mapzilla.service.MapService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping({"/","/home"})
    public String getDefaultMap(Model model){
        Location location = new Location();
        model.addAttribute(location);
        mapService.addCoordinates(location);

        return "index.html";
    }

    @PostMapping("/home")
    public String getMapForLocation(Location location, Model model){
        mapService.addCoordinates(location);
        model.addAttribute(location);
        return "index.html";
    }
}
