package com.demo.currencyconverter.controllernew;

import com.demo.currencyconverter.currencyservice.CurrencyRateService;
import com.demo.currencyconverter.currencyservice.CurrencyService;
import com.demo.currencyconverter.dto.CurrencyDTO;
import com.demo.currencyconverter.dto.ExchangeRateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/currency")
public class CurrencyController {

        @Autowired
        private CurrencyService currencyService;

        @Autowired
        private CurrencyRateService currencyRateService;

        @PostMapping("/convert")
        public double convert(@RequestBody CurrencyDTO request) {
            return currencyService.convertcurrency(request);

        }

        @GetMapping("/getRates")
        public Map<String ,Double> liveRates(@RequestParam String base){
            return currencyRateService.getRates(base);

            }




        }




