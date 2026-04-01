package com.demo.currencyconverter.controllernew;

import com.demo.currencyconverter.currencyservice.CurrencyRateService;
import com.demo.currencyconverter.currencyservice.CurrencyService;
import com.demo.currencyconverter.dto.CurrencyDTO;
import com.demo.currencyconverter.dto.ExchangeRateResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/currency")
@Slf4j
public class CurrencyController {

    private static final Logger log = LoggerFactory.getLogger(CurrencyController.class);
    @Autowired
        private CurrencyService currencyService;

        @Autowired
        private CurrencyRateService currencyRateService;

        @PostMapping("/convert")
        public double convert(@RequestBody CurrencyDTO request) {
            log.info("Received request for conversion:{}",request);
            return currencyService.convertcurrency(request);

        }

        @GetMapping("/getRates")
        public Map<String ,Double> liveRates(@RequestParam String base){
            return currencyRateService.getRates(base);

            }




        }




