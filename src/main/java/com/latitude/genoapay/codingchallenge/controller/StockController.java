package com.latitude.genoapay.codingchallenge.controller;

import com.latitude.genoapay.codingchallenge.models.StockPriceAnalyserRequest;
import com.latitude.genoapay.codingchallenge.models.StockPriceAnalyserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	@PostMapping("/analyse")
	public ResponseEntity<StockPriceAnalyserResponse> getMaxProfit(@RequestBody StockPriceAnalyserRequest request) {
		return ResponseEntity.ok(new StockPriceAnalyserResponse(request));
	}

}