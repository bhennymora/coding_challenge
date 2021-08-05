package com.latitude.genoapay.codingchallenge.models;

import java.util.Date;

public class StockPriceAnalyserRequest {
    private String identifier;
    private Date startDateTime;
    private Date endDateTime;
    private int[] stockPrices;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public int[] getStockPrices() {
        return stockPrices;
    }

    public void setStockPrices(int[] stockPrices) {
        this.stockPrices = stockPrices;
    }
}
