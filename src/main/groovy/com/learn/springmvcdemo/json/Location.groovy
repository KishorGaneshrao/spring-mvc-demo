package com.learn.springmvcdemo.json


class Location {

    private Double Lat
    private Double lng

    Double getLat() {
        return Lat
    }

    void setLat(Double lat) {
        Lat = lat
    }

    Double getLng() {
        return lng
    }

    void setLng(Double lng) {
        this.lng = lng
    }


    @Override
    String toString() {
        return "Location { Lat = $Lat, lng = $lng }"
    }
}
