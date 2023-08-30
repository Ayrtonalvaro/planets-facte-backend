package com.theplanets.theplanetswiki.repository;

import com.theplanets.theplanetswiki.model.Planet;
import com.theplanets.theplanetswiki.model.PlanetSearchCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {
    public Optional<Planet> findByName(String name);




}
