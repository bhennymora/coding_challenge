package com.latitude.genoapay.codingchallenge.models;

public class StockPriceAnalysisResult {
    private int buy;
    private int sell;

    public int getBuy() {
        return buy;
    }

    public void setBuy(int buy) {
        this.buy = buy;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int getProfit() {
        return (this.sell - this.buy);
    }

}
