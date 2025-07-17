package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TravelCalculatePremiumServiceImplTest {

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
        when(dateTimeService
                        .getDaysBetween(request.getAgreementDateFrom(),
                                request.getAgreementDateTo()))
                .thenReturn(0L);
    }

    @Test
    public void testPersonFirstName_1() {
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName_2() {
        request.setPersonFirstName("Anna");
        request.setPersonLastName("Rostova");

        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName_3() {
        request.setPersonFirstName("Sasha");
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName_4() {
        request.setPersonFirstName("Andrey");
        response = service.calculatePremium(request);
        Assertions.assertNotEquals("Sasha", response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName_5() {
        request.setPersonFirstName("Andrey");
        request.setPersonFirstName("Igor");
        request.setPersonFirstName("Petr");
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonLastName_1() {
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testPersonLastName_2() {
        request.setPersonFirstName("Anna");
        request.setPersonLastName("Rostova");

        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testPersonLastName_3() {
        request.setPersonLastName("Ivanov");
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testPersonLastName_4() {
        request.setPersonLastName("Sidorov");
        response = service.calculatePremium(request);
        Assertions.assertNotEquals("Ivanov", response.getPersonLastName());
    }

    @Test
    public void testPersonLastName_5() {
        request.setPersonLastName("Makarov");
        request.setPersonLastName("Smirnov");
        request.setPersonLastName("Petrov");
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testAgreementDateFrom_1() {
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
    }

    @Test
    public void testAgreementDateTo_1() {
        response = service.calculatePremium(request);
        Assertions.assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
    }

    @Test
    public void testAgreementPrice() {
        response = service.calculatePremium(request);
        Assertions.assertNotNull(response.getAgreementPrice());
    }

}