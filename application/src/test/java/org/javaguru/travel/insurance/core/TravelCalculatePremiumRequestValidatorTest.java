package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.dto.ValidationError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void testValidatePersonFirstName_2() {
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn("Smirnova");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testValidatePersonFirstName_3() {
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn("Smirnova");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getField(), "personFirstName");
    }

    @Test
    public void testValidatePersonFirstName_4() {
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn("Smirnova");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getMessage(), "Must not be empty!");
    }

    @Test
    public void testValidatePersonFirstName_5() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testValidatePersonFirstName_6() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getField(), "personFirstName");
    }

    @Test
    public void testValidatePersonFirstName_7() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getMessage(), "Must not be empty!");
    }

    @Test
    public void testValidatePersonLastName_1() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("Smirnova");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void testValidatePersonLastName_2() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testValidatePersonLastName_3() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getField(), "personLastName");
    }

    @Test
    public void testValidatePersonLastName_4() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getMessage(), "Must not be empty!");
    }

    @Test
    public void testValidatePersonLastName_5() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testValidatePersonLastName_6() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getField(), "personLastName");
    }

    @Test
    public void testValidatePersonLastName_7() {
        when(request.getPersonFirstName()).thenReturn("John");
        when(request.getPersonLastName()).thenReturn("");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(list.get(0).getMessage(), "Must not be empty!");
    }

    @Test
    public void testValidate_8() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn("");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void testValidate_9() {
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void testValidate_10() {
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn("");
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void testValidate_11() {
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn(null);
        List<ValidationError> list = validator.validate(request);
        Assertions.assertEquals(2, list.size());
    }
}
