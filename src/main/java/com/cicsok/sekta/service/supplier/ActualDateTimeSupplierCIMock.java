package com.cicsok.sekta.service.supplier;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.function.Supplier;

@Profile("ci")
@Component
@ConditionalOnMissingBean(name = "actualDateTimeSupplier")
public class ActualDateTimeSupplierCIMock implements Supplier<LocalDateTime> {

    private static final int YEAR = 2022;

    private static final Month MONTH = Month.JUNE;

    private static final int DAY = 9;

    private static final int HOUR = 8;

    private static final int MINUTE = 7;

    private static final int SECOND = 0;

    private static final LocalDateTime MOCK_DATE_TIME = LocalDateTime.of(YEAR, MONTH, DAY, HOUR, MINUTE, SECOND);

    @Override
    public LocalDateTime get() {
        return MOCK_DATE_TIME;
    }
}
