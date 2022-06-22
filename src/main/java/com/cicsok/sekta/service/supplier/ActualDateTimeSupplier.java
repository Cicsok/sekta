package com.cicsok.sekta.service.supplier;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.function.Supplier;

@Component
public class ActualDateTimeSupplier implements Supplier<LocalDateTime> {

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}
