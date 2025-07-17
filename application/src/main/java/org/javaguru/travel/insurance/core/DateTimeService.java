package org.javaguru.travel.insurance.core;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Component
class DateTimeService {
    public long getDaysBetween(Date from, Date to) {
        Instant startInstant =  from.toInstant();
        Instant endInstant = to.toInstant();
        long days = ChronoUnit.DAYS.between(startInstant, endInstant);
        return days;
    }
}
