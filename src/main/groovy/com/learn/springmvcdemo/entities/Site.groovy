package com.learn.springmvcdemo.entities

class Site {

    private Integer id
    private String name
    private Double latitude
    private Double longitude

    Site() {
    }

    Site(String name, Double latitude, Double longitude) {
        this.name = name
        this.latitude = latitude
        this.longitude = longitude
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Double getLatitude() {
        return latitude
    }

    void setLatitude(Double latitude) {
        this.latitude = latitude
    }

    Double getLongitude() {
        return longitude
    }

    void setLongitude(Double longitude) {
        this.longitude = longitude
    }


    @Override
    String toString() {
        return "Site{id=$id, name=$name, latitude=$latitude, longitude=$longitude}"
    }
}
