package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.dto.TravelCalculatePremiumResponse;
import org.javaguru.travel.insurance.dto.ValidationError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TravelCalculatePremiumServiceImplTest {

    @Mock
    private TravelCalculatePremiumRequestValidator requestValidator;
    @Mock
    private DateTimeService dateTimeService;

    @InjectMocks
    private TravelCalculatePremiumServiceImpl service;

    private TravelCalculatePremiumRequest request;
    private TravelCalculatePremiumResponse response;

    private TravelCalculatePremiumRequest createRequest() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                "Nikita",
                "Ivanov",
                new Date(),
                new Date()
        );
        return request;
    }

    @BeforeEach
    public void setUp() {
        request = createRequest();
    }

    @Test
    public void testPersonFirstName_1() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName_2() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        request.setPersonFirstName("Anna");
        request.setPersonLastName("Rostova");

        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName_3() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        request.setPersonFirstName("Sasha");
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName_4() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        request.setPersonFirstName("Andrey");
        response = service.calculatePremium(request);
        Assertions.assertNotEquals("Sasha", response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName_5() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        request.setPersonFirstName("Andrey");
        request.setPersonFirstName("Igor");
        request.setPersonFirstName("Petr");
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonLastName_1() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testPersonLastName_2() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        request.setPersonFirstName("Anna");
        request.setPersonLastName("Rostova");

        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testPersonLastName_3() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        request.setPersonLastName("Ivanov");
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testPersonLastName_4() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        request.setPersonLastName("Sidorov");
        response = service.calculatePremium(request);
        Assertions.assertNotEquals("Ivanov", response.getPersonLastName());
    }

    @Test
    public void testPersonLastName_5() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        request.setPersonLastName("Makarov");
        request.setPersonLastName("Smirnov");
        request.setPersonLastName("Petrov");
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testAgreementDateFrom_1() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
    }

    @Test
    public void testAgreementDateTo_1() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
    }

    @Test
    public void testAgreementPrice() {
        when(dateTimeService
                .getDaysBetween(request.getAgreementDateFrom(),
                        request.getAgreementDateTo()))
                .thenReturn(0L);
        when(requestValidator.validate(request)).thenReturn(List.of());
        response = service.calculatePremium(request);
        Assertions.assertNotNull(response.getAgreementPrice());
    }

    @Test
    public void testResponseWithErrors() {
        var validationError = new ValidationError("field", "message");
        when(requestValidator.validate(request)).thenReturn(List.of(validationError));
        response = service.calculatePremium(request);
        Assertions.assertTrue(response.hasErrors());
    }

    @Test
    public void testResponseWithCorrectErrorCount() {
        var validationError = new ValidationError("field", "message");
        when(requestValidator.validate(request)).thenReturn(List.of(validationError));
        response = service.calculatePremium(request);
        Assertions.assertEquals(response.getErrors().size(), 1);
    }

    @Test
    public void testResponseWithCorrectError() {
        var validationError = new ValidationError("field", "message");
        when(requestValidator.validate(request)).thenReturn(List.of(validationError));
        response = service.calculatePremium(request);
        Assertions.assertEquals(response.getErrors().get(0).getField(), "field");
        Assertions.assertEquals(response.getErrors().get(0).getMessage(), "message");
        Assertions.assertNull(response.getPersonFirstName());
    }

    @Test
    public void testMustBeEmptyWhenResponseContainsError() {
        var validationError = new ValidationError("field", "message");
        when(requestValidator.validate(request)).thenReturn(List.of(validationError));
        var response = service.calculatePremium(request);
        Assertions.assertNull(response.getPersonFirstName());
        Assertions.assertNull(response.getPersonLastName());
        Assertions.assertNull(response.getAgreementDateFrom());
        Assertions.assertNull(response.getAgreementDateTo());
        Assertions.assertNull(response.getAgreementPrice());
    }

    @Test
    public void testWithDateTimeServiceWhenResponseContainsError() {
        var validationError = new ValidationError("field", "message");
        when(requestValidator.validate(request)).thenReturn(List.of(validationError));
        response = service.calculatePremium(request);
        verifyNoInteractions(dateTimeService);
    }

}