package com.cicsok.sekta.service.supplier;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.function.Supplier;

@Component
@ConditionalOnMissingBean(name = "actualDateTimeSupplierCIMock")
public class ActualDateTimeSupplier implements Supplier<LocalDateTime> {

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}
