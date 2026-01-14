package com.smartload.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartload.dto.SmartLoadRequest;
import com.smartload.dto.SmartLoadResponse;
import com.smartload.model.Shipment;
import com.smartload.service.SmartLoadService;

@RestController
@RequestMapping("/api/smartload")
public class SmartLoadController {
	 private final SmartLoadService smartLoadService;

	    public SmartLoadController(SmartLoadService smartLoadService) {
	        this.smartLoadService = smartLoadService;
	    }

	    @PostMapping("/optimize")
	    public SmartLoadResponse optimize(@RequestBody SmartLoadRequest request) {

	        List<Shipment> selected =
	                smartLoadService.findBestLoads(
	                        request.getShipments(),
	                        request.getMaxWeight()
	                );

	        double totalProfit = selected.stream()
	                .mapToDouble(Shipment::getProfit)
	                .sum();

	        double totalWeight = selected.stream()
	                .mapToDouble(Shipment::getWeight)
	                .sum();

	        return new SmartLoadResponse(selected, totalProfit, totalWeight);
	    }

}
