package com.cicsok.sekta.web.pageloader.controller;

import com.cicsok.sekta.service.supplier.RandomNumberGeneratorService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class RandomNumberGeneratorController {

    private static final String HTML_PAGE_VIEW_NAME = "random-number-generator";

    private final RandomNumberGeneratorService randomNumberGeneratorService;

    @GetMapping("/random-number-generator")
    public String showForm(final Model model) {
        final RandomNumberQuery randomNumberQuery = new RandomNumberQuery();
        model.addAttribute("randomNumberQuery", randomNumberQuery);

        return HTML_PAGE_VIEW_NAME;
    }

    @PostMapping(value = "/random-number-generator")
    public String generateRandomNumber(@ModelAttribute("randomNumberQuery") final RandomNumberQuery randomNumberQuery) {
        randomNumberQuery.setRandomNumber(randomNumberGeneratorService.generateRandomNumber(randomNumberQuery.getMin(), randomNumberQuery.getMax()));
        return HTML_PAGE_VIEW_NAME;
    }

    @Data
    private static class RandomNumberQuery {

        private Integer min;

        private Integer max;

        private Integer randomNumber;
    }
}