package com.theplanets.theplanetswiki.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_planet")
    private String name;

    @Column(name = "overview_planet")
    private String overview;

    @Column(name = "internalStructure_planet")
    private String internalStructure;

    @Column(name = "surfaceGeology_planet")
    private String surfaceGeology;

    @Column(name = "rotationTime_planet")
    private Double rotationTime;

    @Column(name = "revolutionTime_planet")
    private Double revolutionTime;

    @Column(name = "radius_planet")
    private Double radius;

    @Column(name = "averageTemp_planet")
    private Double averageTemp;

    @Column(name = "sourceWiki")
    private String sourceWiki;

    public Planet() {
    }

    public Planet(String name, String overview, String internalStructure, String surfaceGeology, Double rotationTime, Double revolutionTime, Double radius, Double averageTemp, String sourceWiki) {
        this.name = name;
        this.overview = overview;
        this.internalStructure = internalStructure;
        this.surfaceGeology = surfaceGeology;
        this.rotationTime = rotationTime;
        this.revolutionTime = revolutionTime;
        this.radius = radius;
        this.averageTemp = averageTemp;
        this.sourceWiki = sourceWiki;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getInternalStructure() {
        return internalStructure;
    }

    public void setInternalStructure(String internalStructure) {
        this.internalStructure = internalStructure;
    }

    public String getSurfaceGeology() {
        return surfaceGeology;
    }

    public void setSurfaceGeology(String surfaceGeology) {
        this.surfaceGeology = surfaceGeology;
    }

    public Double getRotationTime() {
        return rotationTime;
    }

    public void setRotationTime(Double rotationTime) {
        this.rotationTime = rotationTime;
    }

    public Double getRevolutionTime() {
        return revolutionTime;
    }

    public void setRevolutionTime(Double revolutionTime) {
        this.revolutionTime = revolutionTime;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(Double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public String getSourceWiki() {
        return sourceWiki;
    }

    public void setSourceWiki(String sourceWiki) {
        this.sourceWiki = sourceWiki;
    }
}
