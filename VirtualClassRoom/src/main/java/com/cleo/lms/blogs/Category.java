package com.cleo.lms.blogs;

public enum Category {

    FASHION("FASHION", "fashion"),
    SCIENCE("SCIENCE","science"),
    NEWS("NEWS AND EVENTS","news"),
    OTHERS("OTHERS","others");

    private String name;
    private String slug;

    Category(String name, String slug) {
        this.name = name;
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public String toString() {
        return getName();
    }
}
