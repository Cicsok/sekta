package com.cicsok.sekta.service.supplier;

import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class RandomNumberGeneratorService {

    private static final int ONE = 1;

    public int generateRandomNumber(final int min, final int max) {
        return ThreadLocalRandom.current().nextInt(min, max + ONE);
    }
}