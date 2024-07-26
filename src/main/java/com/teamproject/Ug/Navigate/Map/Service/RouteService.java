package com.teamproject.Ug.Navigate.Map.Service;

import com.teamproject.Ug.Navigate.Map.Entities.Location;
import com.teamproject.Ug.Navigate.Map.Entities.Route;
import com.teamproject.Ug.Navigate.Map.Repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Route> findOptimalRoutes(Location source, Location destination) {
        // Implement routing algorithms here
        return new ArrayList<>();
    }

    public Route findOptimalRoute(String source, String destination) {
        return null;
    }


    public void deleteRoute(Long id) {

    }

    public Route saveRoute(Route route) {
        return route;
    }

    public Route getRouteById(Long id) {
        return null;
    }

    public List<Route> getAllRoutes() {
        return List.of();
    }
}
