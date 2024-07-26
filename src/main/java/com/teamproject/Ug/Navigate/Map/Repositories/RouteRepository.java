package com.teamproject.Ug.Navigate.Map.Repositories;

import com.teamproject.Ug.Navigate.Map.Entities.Location;
import com.teamproject.Ug.Navigate.Map.Entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// RouteRepository.
public interface RouteRepository extends JpaRepository<Route, Long> {
    List<Route> findBySourceAndDestination(Location source, Location destination);
}