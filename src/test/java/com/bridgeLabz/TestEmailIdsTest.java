package com.bridgeLabz;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmailIdsTest {
	TestEmailIds testEmailIds = new TestEmailIds();

    @Test
    public void givenEmailId1_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc@yahoo.com");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId2_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc-100@yahoo.com");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId3_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc.100@yahoo.com");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId4_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc111@abc.com");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId5_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc-100@abc.net");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId6_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc.100@abc.com.au");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId7_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc@1.com");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId8_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc@gmail.com.com");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId9_IsProper_ReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc+100@gmail.com");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmilId1_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId2_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@.com.my");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId3_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc123@gmail.a");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId4_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc123@.com");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId5_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc123@.com.com");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilIds6_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails(".abc@abc.com");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId7_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc()*@gmail.com");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId8_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@%*.com");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId9_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc..2002@gmail.com");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId10_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc.@gmail.com");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId11_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@abc@gmail.com");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId12_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@gmail.com.1a");
        assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId13_IsNotProper_ReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@gmail.com.aa.au");
        assertEquals(false, actualResult);
    }
	
}
