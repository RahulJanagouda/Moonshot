package com.rj.appliedCs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryCodeTest {

    CountryCode countryCode = new CountryCode();
    @BeforeEach
    void setUp() {
        countryCode.setup();
    }

    @Test
    void getCountry() {
        assertEquals("India",countryCode.getCountry("IND"));
        assertEquals("IND",countryCode.getCountry("India"));
        assertEquals("Helpful error",countryCode.getCountry("QWEQQ"));
    }

}