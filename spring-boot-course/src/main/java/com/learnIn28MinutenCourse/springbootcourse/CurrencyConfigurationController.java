package com.learnIn28MinutenCourse.springbootcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
    @Autowired
    private CurrencyServiceConfiguration currencyConfiguration;
    @RequestMapping("/config")
    public CurrencyServiceConfiguration retrieveCurrencyConfiguration(){
        return currencyConfiguration;
    }
}
