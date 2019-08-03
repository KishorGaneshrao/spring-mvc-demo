package com.learn.springmvcdemo.template

class Value {

    private int id
    private String joke
    private List<String> categories

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    String getJoke() {
        return joke
    }

    void setJoke(String joke) {
        this.joke = joke
    }

    List<String> getCategories() {
        return categories
    }

    void setCategories(List<String> categories) {
        this.categories = categories
    }
}
