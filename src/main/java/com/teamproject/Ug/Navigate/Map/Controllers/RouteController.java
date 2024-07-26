package com.teamproject.Ug.Navigate.Map.Controllers;

import com.teamproject.Ug.Navigate.Map.Entities.Route;
import com.teamproject.Ug.Navigate.Map.Service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @GetMapping
    public List<Route> getAllRoutes() {
        return routeService.getAllRoutes();
    }

    @GetMapping("/{id}")
    public Route getRouteById(@PathVariable Long id) {
        return routeService.getRouteById(id);
    }

    @PostMapping
    public Route saveRoute(@RequestBody Route route) {
        return routeService.saveRoute(route);
    }

    @DeleteMapping("/{id}")
    public void deleteRoute(@PathVariable Long id) {
        routeService.deleteRoute(id);
    }
}

