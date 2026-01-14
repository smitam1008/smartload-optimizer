package com.smartload.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smartload.model.Shipment;
@Service
public class SmartLoadService {
	 public List<Shipment> findBestLoads(List<Shipment> shipments, double maxWeight) {

	        // Sort shipments by profit/weight ratio (descending)
	        shipments.sort(
	                Comparator.comparingDouble(
	                		(Shipment s)  -> s.getProfit() / s.getWeight()
	                ).reversed()
	        );

	        List<Shipment> selected = new ArrayList<>();
	        double currentWeight = 0;

	        for (Shipment shipment : shipments) {
	            if (currentWeight + shipment.getWeight() <= maxWeight) {
	                selected.add(shipment);
	                currentWeight += shipment.getWeight();
	            }
	        }

	        return selected;
	    }

}
