package org.javaguru.travel.insurance.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class CoreResponse {
    @Getter
    @Setter
    private List<ValidationError> errors;

    public boolean hasErrors() {
        return errors != null && !errors.isEmpty();
    }
}
