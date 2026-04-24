package com.example.autowire.constructor;

public class Specification {

    private String make;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("model set by constructor");
        this.model = model;
    }

    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        //System.out.println("make called");
        this.make = make;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
