package com.latitude.genoapay.codingchallenge.engine;

import com.latitude.genoapay.codingchallenge.models.StockPriceAnalysisResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StockPriceAnalyserTest {

    @Test
    void contextLoads() {
    }

    @Test
    void testAnalyseStock(){
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        StockPriceAnalysisResult analysisResult = StockPriceAnalyser.AnalyseStock(stockPrices);
        assertEquals(6, analysisResult.getProfit());
    }
}