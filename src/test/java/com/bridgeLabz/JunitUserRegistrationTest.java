package com.bridgeLabz;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class JunitUserRegistrationTest {

    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.firstName("Ramakrishna");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.firstName("RamaKrishna");
        assertEquals(false, actualResult);
    }
}
