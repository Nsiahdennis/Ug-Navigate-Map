package com.teamproject.Ug.Navigate.Map.Controllers;

import com.teamproject.Ug.Navigate.Map.Entities.Landmark;
import com.teamproject.Ug.Navigate.Map.Service.LandmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/landmarks")
public class LandmarkController {
    @Autowired
    private LandmarkService landmarkService;

    @GetMapping
    public List<Landmark> getAllLandmarks() {
        return landmarkService.getAllLandmarks();
    }

    @GetMapping("/{id}")
    public Landmark getLandmarkById(@PathVariable Long id) {
        return landmarkService.getLandmarkById(id);
    }

    @ PostMapping
    public Landmark saveLandmark(@RequestBody Landmark landmark) {
        return landmarkService.saveLandmark(landmark);
    }

    @DeleteMapping("/{id}")
    public void deleteLandmark(@PathVariable Long id) {
        landmarkService.deleteLandmark(id);
    }
}

