package com.theplanets.theplanetswiki.dto;

public class PlanetDto {

    private String name;
    private String overview;
    private String internalStructure;
    private String surfaceGeology;
    private String rotationTime;
    private String revolutionTime;
    private String radius;
    private String averageTemp;

    private String sourceWiki;
    public PlanetDto() {
    }

    public PlanetDto(String name, String overview, String internalStructure, String surfaceGeology, String rotationTime, String revolutionTime, String radius, String averageTemp, String sourceWiki) {
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

    public String getRotationTime() {
        return rotationTime;
    }

    public void setRotationTime(String rotationTime) {
        this.rotationTime = rotationTime;
    }

    public String getRevolutionTime() {
        return revolutionTime;
    }

    public void setRevolutionTime(String revolutionTime) {
        this.revolutionTime = revolutionTime;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(String averageTemp) {
        this.averageTemp = averageTemp;
    }

    public String getSourceWiki() {
        return sourceWiki;
    }

    public void setSourceWiki(String sourceWiki) {
        this.sourceWiki = sourceWiki;
    }
}
