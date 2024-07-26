package com.teamproject.Ug.Navigate.Map.Service;

import com.teamproject.Ug.Navigate.Map.Entities.Landmark;
import com.teamproject.Ug.Navigate.Map.Repositories.LandmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandmarkService {
    @Autowired
    private LandmarkRepository landmarkRepository;

    public List<Landmark> getAllLandmarks() {
        return landmarkRepository.findAll();
    }

    public Landmark getLandmarkById(Long id) {
        return landmarkRepository.findById(id).orElse(null);
    }

    public Landmark saveLandmark(Landmark landmark) {
        return landmarkRepository.save(landmark);
    }

    public void deleteLandmark(Long id) {
        landmarkRepository.deleteById(id);
    }
}
