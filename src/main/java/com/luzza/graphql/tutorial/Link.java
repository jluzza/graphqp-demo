package com.luzza.graphql.tutorial;

public class Link {
    
    private final String id;
    private final String url;
    private final String rating;
    private final String description;

    public Link(String url, String description, String rating) {
        this(null, url, description, rating);
    }

    public Link(String id, String url, String description, String rating) {
        this.url = url;
        this.description = description;
        this.id = id;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getRating() {
        return rating;
    }
}