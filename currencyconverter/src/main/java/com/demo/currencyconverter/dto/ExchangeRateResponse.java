package com.demo.currencyconverter.dto;

import java.util.Map;

public class ExchangeRateResponse {

    private String base;
    private Map<String,Number> conversion_rates;

    public String getBase() {
        return base;
    }


    @Override
    public String toString() {
        return "ExchangeRateResponse{" +
                "base='" + base + '\'' +
                ", rates=" + conversion_rates +
                '}';
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, Number> getRates() {
        return conversion_rates;
    }

    public void setRates(Map<String, Number> rates) {
        this.conversion_rates = rates;
    }
}
