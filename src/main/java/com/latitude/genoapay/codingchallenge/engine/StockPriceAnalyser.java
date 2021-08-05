package com.latitude.genoapay.codingchallenge.engine;

import com.latitude.genoapay.codingchallenge.models.StockPriceAnalysisResult;

import java.util.ArrayList;

public class StockPriceAnalyser {

    public static StockPriceAnalysisResult AnalyseStock(int[] stockPrices) {
        StockPriceAnalysisResult analysisResult = new StockPriceAnalysisResult();
        for (int i = 0; i < stockPrices.length - 1; i++) {

            if (i == 0) {
                analysisResult.setBuy(stockPrices[i]);
            } else {
                if (analysisResult.getBuy() > stockPrices[i]) {
                    analysisResult.setBuy(stockPrices[i]);
                }
            }

            for (int j = i + 1; j < stockPrices.length; j++) {
                if (j == 1) {
                    analysisResult.setSell(stockPrices[j]);
                } else {
                    if (analysisResult.getSell() < stockPrices[j]) {
                        analysisResult.setSell(stockPrices[j]);
                    }
                }
            }
        }
        return analysisResult;
    }

}
