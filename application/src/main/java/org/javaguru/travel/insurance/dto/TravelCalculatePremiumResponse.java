package org.javaguru.travel.insurance.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class TravelCalculatePremiumResponse extends CoreResponse{
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

    public TravelCalculatePremiumResponse(List<ValidationError> errors) {
        super(errors);
    }
}
