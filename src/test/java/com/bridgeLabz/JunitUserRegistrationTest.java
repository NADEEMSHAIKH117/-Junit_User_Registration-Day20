package com.bridgeLabz;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class JunitUserRegistrationTest {

    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.firstName("Nadeem");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.firstName("NadeemS");
        assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.lastName("Shaikh");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.lastName("ShaiKH");
        assertEquals(false, actualResult);
    }
}
