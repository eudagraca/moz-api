package moz.api.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;

@Entity
public class Province extends PanacheEntity {
    private String name;
    @Enumerated(EnumType.STRING)
    private Location location;
    private String area;
    private String gentile;
    private Double population;
    @Column(length = 5000, unique = true)
    private String description;
    private Double latitude;
    private Double longitude;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGentile() {
        return this.gentile;
    }

    public void setGentile(String gentile) {
        this.gentile = gentile;
    }

    public Double getPopulation() {
        return this.population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }




}
