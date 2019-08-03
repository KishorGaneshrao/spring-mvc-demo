package com.learn.springmvcdemo.json

class Response {

    private List<Result> results
    private String status

    List<Result> getResults() {
        return results
    }

    void setResults(List<Result> results) {
        this.results = results
    }

    String getStatus() {
        return status
    }

    void setStatus(String status) {
        this.status = status
    }

    Location getLocation() {
        return results.get(0).geometry.location
    }

    String getFormattedAddress() {
        return results.get(0).formattedAddress
    }

}
