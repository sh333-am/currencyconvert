package com.demo.currencyconverter.dto;

import java.util.Map;

public class CurrencyDTO {
    private String from;
    private String to;
    private Double amount;



    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getFrom() {
        return from;
    }



    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    @Override
    public String toString() {
        return "CurrencyDTO{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", amount=" + amount +
                '}';
    }
}
