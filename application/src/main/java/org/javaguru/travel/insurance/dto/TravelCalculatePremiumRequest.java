package org.javaguru.travel.insurance.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class TravelCalculatePremiumRequest {
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
}
