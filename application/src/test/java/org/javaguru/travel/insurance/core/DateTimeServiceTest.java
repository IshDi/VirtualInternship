package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeServiceTest {

    @Test
    void shouldReturnZeroForSameDate() {
        Date sameDate = new Date();
        long result = new DateTimeService().getDaysBetween(sameDate, sameDate);
        assertEquals(0, result);
    }

    @Test
    void shouldReturnPositiveDifferenceWhenEndIsLater() throws Exception {
        Date earlierDate = new Date(2023, Calendar.JANUARY, 1); // Январь 1, 2023
        Date laterDate = new Date(2023, Calendar.JANUARY, 3);   // Январь 3, 2023
        long result = new DateTimeService().getDaysBetween(earlierDate, laterDate);
        assertEquals(2, result);
    }

    @Test
    void shouldReturnNegativeDifferenceWhenStartIsLater() throws Exception {
        Date laterDate = new Date(2023, Calendar.JANUARY, 3);   // Январь 3, 2023
        Date earlierDate = new Date(2023, Calendar.JANUARY, 1); // Январь 1, 2023
        long result = new DateTimeService().getDaysBetween(laterDate, earlierDate);
        assertEquals(-2, result);
    }

    @Test
    void shouldHandleYearBoundaryCorrectly() throws Exception {
        Date startDate = new Date(2022, Calendar.DECEMBER, 31); // Декабрь 31, 2022
        Date endDate = new Date(2023, Calendar.JANUARY, 1);     // Январь 1, 2023
        long result = new DateTimeService().getDaysBetween(startDate, endDate);
        assertEquals(1, result);
    }

    @Test
    void shouldHandleMonthBoundaryCorrectly() throws Exception {
        Date startDate = new Date(2023, Calendar.JANUARY, 31); // Январь 31, 2023
        Date endDate = new Date(2023, Calendar.FEBRUARY, 1);    // Февраль 1, 2023
        long result = new DateTimeService().getDaysBetween(startDate, endDate);
        assertEquals(1, result);
    }

    @Test
    void shouldHandleEdgeCaseOneDayDifference() throws Exception {
        Date startDate = new Date(2023, Calendar.JANUARY, 1); // Январь 1, 2023
        Date endDate = new Date(2023, Calendar.JANUARY, 2);   // Январь 2, 2023
        long result = new DateTimeService().getDaysBetween(startDate, endDate);
        assertEquals(1, result);
    }

    @Test
    void shouldHandleLeapYearsCorrectly() throws Exception {
        Date leapYearStart = new Date(2020, Calendar.FEBRUARY, 28); // Февраль 28, 2020 (високосный год)
        Date leapYearEnd = new Date(2020, Calendar.MARCH, 1);    // Март 1, 2020
        long result = new DateTimeService().getDaysBetween(leapYearStart, leapYearEnd);
        assertEquals(2, result);
    }
}
