package com.pradithya.chucknorrisjoke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JokeConfiguration {

    @Bean
    public ChuckNorrisQuotes provideChuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
