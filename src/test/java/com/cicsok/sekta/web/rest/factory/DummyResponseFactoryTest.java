package com.cicsok.sekta.web.rest.factory;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.function.Supplier;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.BDDMockito.given;

public class DummyResponseFactoryTest {

    private static final int YEAR = 2022;
    private static final Month MONTH = Month.JUNE;
    private static final int DAY = 9;

    private static final int HOUR = 8;
    private static final int MINUTE = 7;
    private static final int SECOND = 0;

    private static final LocalDateTime ACTUAL_DATE_TIME = LocalDateTime.of(YEAR, MONTH, DAY, HOUR, MINUTE, SECOND);

    @Mock
    private Supplier<LocalDateTime> dateTimeSupplierMock;

    private DummyResponseFactory underTest;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

        underTest = new DummyResponseFactory(dateTimeSupplierMock);
    }

    @Test
    public void createShouldProduceActualDateAndTimeCorrectly() {
        // Given
        final var expectedDate = "2022-06-09";
        final var expectedTime = "08:07:00";

        given(dateTimeSupplierMock.get()).willReturn(ACTUAL_DATE_TIME);

        // When
        final var actual = underTest.create();

        // Then
        assertThat(actual, notNullValue());
        assertThat(actual.getDate(), equalTo(expectedDate));
        assertThat(actual.getTime(), equalTo(expectedTime));
    }
}
