package com.demo.currencyconverter.currencyservice;


import com.demo.currencyconverter.dto.ExchangeRateResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class CurrencyRateService {

    @Autowired
    private RestTemplate apiCall;

    @Value("${exchange.api.url}")
    private String apiUrl;

    @Value("${exchange.api.key}")
    private String apiKey;

    public Map<String, Double> getRates(String base){

        String url = apiUrl + "/" + apiKey + "/latest/" + base;



        Map response = apiCall.getForObject(url, Map.class);


        Map<String, Number> rawRates =  (Map<String, Number>) response.get("conversion_rates");

        Map<String, Double> rates = new HashMap<>();

        rawRates.forEach((k, v) -> rates.put(k, v.doubleValue()));

        return rates;
    }
}


