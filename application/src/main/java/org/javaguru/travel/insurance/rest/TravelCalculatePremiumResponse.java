package org.javaguru.travel.insurance.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class TravelCalculatePremiumResponse {
    @Getter
    @Setter
    private String personFirstName;
    @Getter
    @Setter
    private String personLastName;
    @Getter
    @Setter
    private Date agreementDateFrom;
    @Getter
    @Setter
    private Date agreementDateTo;
    @Getter
    @Setter
    private BigDecimal agreementPrice;
}
