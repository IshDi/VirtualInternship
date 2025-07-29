package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.dto.ValidationError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TravelCalculatePremiumRequestValidatorTest {
    private TravelCalculatePremiumRequestValidator validator = new TravelCalculatePremiumRequestValidator();;
    @Mock
    private TravelCalculatePremiumRequest request;

    @Test
    public void testValidatePersonFirstName_1() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void testValidatePersonFirstName_2() {
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testValidatePersonFirstName_3() {
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getField(), "personFirstName");
    }

    @Test
    public void testValidatePersonFirstName_4() {
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getMessage(), "Must not be empty!");
    }

    @Test
    public void testValidatePersonFirstName_5() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testValidatePersonFirstName_6() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getField(), "personFirstName");
    }

    @Test
    public void testValidatePersonFirstName_7() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getMessage(), "Must not be empty!");
    }

    @Test
    public void testValidatePersonLastName_1() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void testValidatePersonLastName_2() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn(null);
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testValidatePersonLastName_3() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn(null);
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getField(), "personLastName");
    }

    @Test
    public void testValidatePersonLastName_4() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn(null);
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getMessage(), "Must not be empty!");
    }

    @Test
    public void testValidatePersonLastName_5() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testValidatePersonLastName_6() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getField(), "personLastName");
    }

    @Test
    public void testValidatePersonLastName_7() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getMessage(), "Must not be empty!");
    }

    @Test
    public void testAgreementDateFrom_1() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date(2025, 1, 1));
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void testAgreementDateFrom_2() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(null);
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testAgreementDateFrom_3() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(null);
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getField(), "agreementDateFrom");
    }

    @Test
    public void testAgreementDateFrom_4() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(null);
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getMessage(), "Must not be empty!");
    }

    @Test
    public void testAgreementDateFrom_5() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(null);
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testAgreementDateTo_1() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date(2025, 1, 1));
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void testAgreementDateTo_2() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testAgreementDateTo_3() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getField(), "agreementDateTo");
    }

    @Test
    public void testAgreementDateTo_4() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getMessage(), "Must not be empty!");
    }

    @Test
    public void testAgreementDateTo_5() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }


    @Test
    public void testValidate_1() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn("");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void testValidate_2() {
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn(null);
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void testValidate_3() {
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn("");
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void testValidate_4() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn(null);
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void testValidate_5() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn(null);
        when(request.getAgreementDateFrom()).thenReturn(null);
        when(request.getAgreementDateTo()).thenReturn(new Date());
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(3, list.size());
    }

    @Test
    public void testValidate_6() {
        when(request.getPersonFirstName()).thenReturn("Jone");
        when(request.getPersonLastName()).thenReturn(null);
        when(request.getAgreementDateFrom()).thenReturn(null);
        when(request.getAgreementDateTo()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(3, list.size());
    }

    @Test
    public void testValidate_7() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn(null);
        when(request.getAgreementDateFrom()).thenReturn(null);
        when(request.getAgreementDateTo()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(4, list.size());
    }

    @Test
    public void testValidate_8() {
        when(request.getPersonFirstName()).thenReturn("Nina");
        when(request.getPersonLastName()).thenReturn("Ivanova");
        when(request.getAgreementDateFrom()).thenReturn(null);
        when(request.getAgreementDateTo()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(2, list.size());
    }
}
