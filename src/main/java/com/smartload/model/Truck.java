package com.smartload.model;

public class Truck {
	private double maxWeight;

    public Truck() {}

    public Truck(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

}
