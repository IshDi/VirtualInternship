package org.javaguru.travel.insurance.core;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimeService {
    long getDaysBetween(Date date1, Date date2) {
        Instant startInstant =  date1.toInstant();
        Instant endInstant = date2.toInstant();
        long days = ChronoUnit.DAYS.between(startInstant, endInstant);
        return days;
    }
}
