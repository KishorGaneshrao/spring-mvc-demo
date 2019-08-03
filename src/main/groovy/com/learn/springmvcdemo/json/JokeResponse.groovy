package com.learn.springmvcdemo.json

class JokeResponse {

    private String status
    private Value value

    String getStatus() {
        return status
    }

    void setStatus(String status) {
        this.status = status
    }

    Value getValue() {
        return value
    }

    void setValue(Value value) {
        this.value = value
    }
}
