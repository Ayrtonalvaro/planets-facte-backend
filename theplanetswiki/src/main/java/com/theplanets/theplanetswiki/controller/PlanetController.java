package com.theplanets.theplanetswiki.controller;

import com.theplanets.theplanetswiki.model.Planet;
import com.theplanets.theplanetswiki.model.PlanetSearchCriteria;
import com.theplanets.theplanetswiki.repository.PlanetRepository;
import com.theplanets.theplanetswiki.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@RestController
@RequestMapping("/planet") //planets
@CrossOrigin(origins = "*")
public class PlanetController {


    private final PlanetService planetService;

    public PlanetController( PlanetService planetService) {

        this.planetService = planetService;
    }

    @GetMapping("/all")  //"/"
    public ResponseEntity<List<Planet>> getPlanets(){
        List<Planet> planets = planetService.findPlanets();
        return  new ResponseEntity<>(planets, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Planet> addPlanet(@RequestBody Planet planet){
        Planet newPlanet = planetService.addPlanet(planet);
        return new ResponseEntity<>(newPlanet, HttpStatus.OK);
    }

    @GetMapping("/filter/{name}") //{name}
    public ResponseEntity<Planet> getPlanetByName(@PathVariable("name") String name){
        Optional<Planet> planetOptional = planetService.findPlanetByName(name);
        Planet planet = planetOptional.orElse(null);
        return new ResponseEntity<>(planet, HttpStatus.OK);
    }

    @GetMapping("/filter/overview/{name}")
    public ResponseEntity<String> getOverviewPlanet(@PathVariable("name") String name){
        Optional<Planet> planetOptional = planetService.findPlanetByName(name);
        String overview = planetOptional.get().getOverview();
        return new ResponseEntity<>(overview, HttpStatus.OK);
    }

    @GetMapping("/filter/internalStructure/{name}")
    public ResponseEntity<String> getInternalStructurePlanet(@PathVariable("name") String name){
        Optional<Planet> planetOptional = planetService.findPlanetByName(name);
        String internalStructure = planetOptional.get().getInternalStructure();
        return new ResponseEntity<>(internalStructure, HttpStatus.OK);
    }

    @GetMapping("/filter/surfaceGeology/{name}")
    public ResponseEntity<String> getSurfaceGeologyPlanet(@PathVariable("name") String name){
        Optional<Planet> planetOptional = planetService.findPlanetByName(name);
        String surfaceGeology = planetOptional.get().getOverview();
        return new ResponseEntity<>(surfaceGeology, HttpStatus.OK);
    }

    @GetMapping("/prueba")
    public ResponseEntity<List<Planet>> findPlanetCriteria(@RequestParam(required = false) String name,
                                                           @RequestParam(required = false) String overview,
                                                           @RequestParam (required = false) String internalStructure,
                                                           @RequestParam(required = false) String surfaceGeology){
        Planet planetSearch = new Planet();
        planetSearch.setName(name);
        planetSearch.setOverview(overview);
        planetSearch.setInternalStructure(internalStructure);
        planetSearch.setSurfaceGeology(surfaceGeology);

        List<Planet> planetFilter = planetService.filterPlanetCriteria(planetSearch);
        return new ResponseEntity<>(planetFilter, HttpStatus.OK);
    }
}
