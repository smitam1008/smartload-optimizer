package com.smartload.dto;

import java.util.List;

import com.smartload.model.Shipment;

public class SmartLoadResponse {
	private List<Shipment> selectedShipments;
    private double totalProfit;
    private double totalWeight;

    public SmartLoadResponse(List<Shipment> selectedShipments,
                             double totalProfit,
                             double totalWeight) {
        this.selectedShipments = selectedShipments;
        this.totalProfit = totalProfit;
        this.totalWeight = totalWeight;
    }

    public List<Shipment> getSelectedShipments() {
        return selectedShipments;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

}
