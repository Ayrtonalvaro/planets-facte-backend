package com.theplanets.theplanetswiki.service;

import com.theplanets.theplanetswiki.model.Planet;
import com.theplanets.theplanetswiki.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
@Transactional
public class PlanetService {

    private final PlanetRepository planetRepository;

    @Autowired
    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet addPlanet (Planet planet){
        return planetRepository.save(planet);
    }

    public List<Planet> findPlanets(){
        return planetRepository.findAll();
    }

    public Optional<Planet> findPlanetById(Long id){
        return planetRepository.findById(id);
    }

    public Optional<Planet> findPlanetByName(String name){
        return planetRepository.findByName(name);
    }

    public void deletePlanet (Long id){
        planetRepository.deleteById(id);
    }

    public List<Planet> filterPlanetCriteria(Planet planet){

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withIgnoreNullValues()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

        Example<Planet> example = Example.of(planet, exampleMatcher);

        return planetRepository.findAll(example);
    }


}
