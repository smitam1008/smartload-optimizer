package com.smartload.model;

public class Shipment {
	private String id;
    private double weight;
    private double profit;

    public Shipment() {}

    public Shipment(String id, double weight, double profit) {
        this.id = id;
        this.weight = weight;
        this.profit = profit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

}
