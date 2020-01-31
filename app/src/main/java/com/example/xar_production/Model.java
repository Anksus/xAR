package com.example.xar_production;

public class Model {
    private String dishes,image,name;

    public Model() {
    }

    public Model(String dishes, String image, String name) {
        this.dishes = dishes;
        this.image = image;
        this.name = name;
    }

    public String getDishes() {
        return dishes;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }
}
