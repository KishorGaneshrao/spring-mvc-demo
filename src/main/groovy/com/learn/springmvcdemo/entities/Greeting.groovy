package com.learn.springmvcdemo.entities

class Greeting {
    private String message

    Greeting() {
    }

    Greeting(String message) {
        this.message = message
    }

    String getMessage() {
        return message
    }

    void setMessage(String message) {
        this.message = message
    }
}
