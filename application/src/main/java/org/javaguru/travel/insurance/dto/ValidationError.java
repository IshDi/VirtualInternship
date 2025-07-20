package org.javaguru.travel.insurance.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class ValidationError {
    @Getter
    @Setter
    private String field;
    @Getter
    @Setter
    private String message;
}
