package com.oop.composition;

public class Engine {
    private String model;
    private String rps;

    public Engine(String model, String rps) {
        this.model = model;
        this.rps = rps;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRps() {
        return rps;
    }

    public void setRps(String rps) {
        this.rps = rps;
    }
}
