package com.cicsok.sekta.web.acceptancetest.ui.page;

import com.cicsok.sekta.web.acceptancetest.ui.provider.PageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageConfig {

    @Bean
    public PageProvider<RandomNumberGeneratorPage> randomNumberGeneratorPage() {
        return new PageProvider<>(RandomNumberGeneratorPage.class);
    }
}
