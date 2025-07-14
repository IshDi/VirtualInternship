package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TravelCalculatePremiumServiceImplTest {

    private DateTimeService dateTimeService;
    private TravelCalculatePremiumServiceImpl service;

    @BeforeEach
    public void setUp() {
        dateTimeService = new DateTimeService();
        service = new TravelCalculatePremiumServiceImpl(dateTimeService);
    }

    private TravelCalculatePremiumRequest createRequest() {
        Date date1 = new Date(2025, 1, 1);
        Date date2 = new Date(2025, 1, 2);
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Nikita", "Ivanov", date1, date2);
        return request;
    }

    @Test
    public void testAllParameters1() {
        TravelCalculatePremiumRequest request = createRequest();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
        Assertions.assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
        Assertions.assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
        Assertions.assertNotNull(response.getAgreementPrice());
    }

    @Test
    public void testAllParameters2() {
        TravelCalculatePremiumRequest request = createRequest();
        Date date1 = new Date(2020, 5, 5);
        Date date2 = new Date(2025, 5, 7);
        request.setPersonFirstName("Anna");
        request.setPersonLastName("Rostova");
        request.setAgreementDateFrom(date1);
        request.setAgreementDateTo(date2);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
        Assertions.assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
        Assertions.assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
        Assertions.assertNotNull(response.getAgreementPrice());
    }

    @Test
    public void testPersonFirstName1() {
        TravelCalculatePremiumRequest request = createRequest();
        request.setPersonFirstName("Sasha");
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName2() {
        TravelCalculatePremiumRequest request = createRequest();
        request.setPersonFirstName("Andrey");
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertNotEquals("Sasha", response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName3() {
        TravelCalculatePremiumRequest request = createRequest();
        request.setPersonFirstName("Andrey");
        request.setPersonFirstName("Igor");
        request.setPersonFirstName("Petr");
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonLastName1() {
        TravelCalculatePremiumRequest request = createRequest();
        request.setPersonLastName("Ivanov");
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testPersonLastName2() {
        TravelCalculatePremiumRequest request = createRequest();
        request.setPersonLastName("Sidorov");
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertNotEquals("Ivanov", response.getPersonLastName());
    }

    @Test
    public void testPersonLastName3() {
        TravelCalculatePremiumRequest request = createRequest();
        request.setPersonLastName("Makarov");
        request.setPersonLastName("Smirnov");
        request.setPersonLastName("Petrov");
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testAgreementDateFrom1() {
        TravelCalculatePremiumRequest request = createRequest();
        request.setAgreementDateFrom(new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
    }

    @Test
    public void testAgreementDateFrom2() {
        TravelCalculatePremiumRequest request = createRequest();
        Date date1 = new Date(2025, 1, 2);
        request.setAgreementDateFrom(date1);
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
    }

    @Test
    public void testAgreementDateFrom3() {
        TravelCalculatePremiumRequest request = createRequest();
        Date date1 = new Date(2025, 1, 2);
        request.setAgreementDateFrom(date1);
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertNotEquals(new Date(), response.getAgreementDateFrom());
    }

    @Test
    public void testAgreementDateTo1() {
        TravelCalculatePremiumRequest request = createRequest();
        request.setAgreementDateTo(new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
    }

    @Test
    public void testAgreementDateTo2() {
        TravelCalculatePremiumRequest request = createRequest();
        Date date1 = new Date(2025, 1, 2);
        request.setAgreementDateTo(date1);
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
    }

    @Test
    public void testAgreementDateTo3() {
        TravelCalculatePremiumRequest request = createRequest();
        Date date1 = new Date(2025, 1, 2);
        request.setAgreementDateTo(date1);
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertNotEquals(new Date(), response.getAgreementDateTo());
    }

}