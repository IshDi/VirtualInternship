package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TravelCalculatePremiumServiceImplTest {

    @Test
    public void testAllParameters1() {
        Date date1 = new Date(2025, 1, 1);
        Date date2 = new Date(2025, 1, 2);
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Nikita", "Ivanov", date1, date2);
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
        Assertions.assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
        Assertions.assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
    }

    @Test
    public void testAllParameters2() {
        Date date1 = new Date(2020, 5, 5);
        Date date2 = new Date(2025, 5, 7);
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("Anna");
        request.setPersonLastName("Rostova");
        request.setAgreementDateFrom(date1);
        request.setAgreementDateTo(date2);

        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
        Assertions.assertEquals(request.getAgreementDateFrom(), response.getAgreementDateFrom());
        Assertions.assertEquals(request.getAgreementDateTo(), response.getAgreementDateTo());
    }

    @Test
    public void testPersonFirstName1() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("Sasha");
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName2() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("Andrey");
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertNotEquals("Sasha", response.getPersonFirstName());
    }

    @Test
    public void testPersonFirstName3() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("Andrey");
        request.setPersonFirstName("Igor");
        request.setPersonFirstName("Petr");
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonFirstName(), response.getPersonFirstName());
    }

    @Test
    public void testPersonLastName1() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonLastName("Ivanov");
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

    @Test
    public void testPersonLastName2() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonLastName("Sidorov");
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertNotEquals("Ivanov", response.getPersonLastName());
    }

    @Test
    public void testPersonLastName3() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonLastName("Makarov");
        request.setPersonLastName("Smirnov");
        request.setPersonLastName("Petrov");
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        Assertions.assertEquals(request.getPersonLastName(), response.getPersonLastName());
    }

}