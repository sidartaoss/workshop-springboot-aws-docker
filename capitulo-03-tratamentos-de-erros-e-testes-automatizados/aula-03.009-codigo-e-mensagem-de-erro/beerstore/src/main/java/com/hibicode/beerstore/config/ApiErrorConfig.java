package com.hibicode.beerstore.config;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

public class ApiErrorConfig {

    public MessageSource apiErrorMessageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/api_errors");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
