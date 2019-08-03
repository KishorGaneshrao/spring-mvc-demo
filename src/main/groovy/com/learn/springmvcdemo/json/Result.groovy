package com.learn.springmvcdemo.json

import com.fasterxml.jackson.annotation.JsonProperty

class Result {

    @JsonProperty("formatted_address")
    private String formattedAddress
    private Geometry geometry

    String getFormattedAddress() {
        return formattedAddress
    }

    void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress
    }

    Geometry getGeometry() {
        return geometry
    }

    void setGeometry(Geometry geometry) {
        this.geometry = geometry
    }
}
