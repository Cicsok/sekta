package com.cicsok.sekta.web.rest.factory;

import com.cicsok.sekta.web.rest.response.DummyResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

@Component
@AllArgsConstructor
public class DummyResponseFactory {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    private final Supplier<LocalDateTime> actualDateTimeSupplier;

    public DummyResponse create() {
        final var dateTime = actualDateTimeSupplier.get();
        
        return DummyResponse.builder()
                .date(dateTime.toLocalDate().format(DATE_FORMATTER))
                .time(dateTime.toLocalTime().format(TIME_FORMATTER))
                .build();
    }
}
