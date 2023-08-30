package com.theplanets.theplanetswiki.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PlanetSearchCriteria {

    private String name;
    private String overview;
    private String internalStructure;
    private String surfaceGeology;
    private Double rotationTime;
    private Double revolutionTime;
    private Double radius;

    private Double averageTemp;

    private String sourceWiki;

    public PlanetSearchCriteria() {
    }

    public PlanetSearchCriteria(String name, String overview, String internalStructure, String surfaceGeology, Double rotationTime, Double revolutionTime, Double radius, Double averageTemp, String sourceWiki) {
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
