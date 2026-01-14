package com.smartload.dto;

import java.util.List;

import com.smartload.model.Shipment;

public class SmartLoadRequest {

    private double maxWeight;
    private List<Shipment> shipments;

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }

}
