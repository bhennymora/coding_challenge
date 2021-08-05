package com.latitude.genoapay.codingchallenge.models;

import com.latitude.genoapay.codingchallenge.engine.StockPriceAnalyser;

import java.util.Date;

public class StockPriceAnalyserResponse {
    private StockPriceAnalyserRequest request;
    private Date processedDateTime;
    private StockPriceAnalysisResult stockPriceAnalysisResult;

    public StockPriceAnalyserResponse(StockPriceAnalyserRequest request) {
        this.request = request;
        this.processedDateTime = new Date();
        this.stockPriceAnalysisResult = StockPriceAnalyser.AnalyseStock(request.getStockPrices());
    }

    public StockPriceAnalyserRequest getRequest() {
        return request;
    }

    public void setRequest(StockPriceAnalyserRequest request) {
        this.request = request;
    }

    public Date getProcessedDateTime() {
        return processedDateTime;
    }

    public void setProcessedDateTime(Date processedDateTime) {
        this.processedDateTime = processedDateTime;
    }

    public int getBuy() {
        return this.stockPriceAnalysisResult.getBuy();
    }

    public int getSell() {
        return this.stockPriceAnalysisResult.getSell();
    }

    public int getProfit() {
        return this.stockPriceAnalysisResult.getProfit();
    }
}
