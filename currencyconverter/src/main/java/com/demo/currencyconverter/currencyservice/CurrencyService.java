package com.demo.currencyconverter.currencyservice;

import com.demo.currencyconverter.dto.CurrencyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CurrencyService {

    @Autowired
    CurrencyRateService currencyRateService;
    public double convertcurrency(CurrencyDTO request){
        String from = request.getFrom();
        String to = request.getTo();
        double amount = request.getAmount();
        Map<String, Double> rates = currencyRateService.getRates(from);

        if (rates == null) {
            throw new RuntimeException("Rates not found");
        }

        Double rate = rates.get(to);

        return amount * rate;
    }
}




