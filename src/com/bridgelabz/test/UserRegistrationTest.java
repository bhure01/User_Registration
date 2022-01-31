package com.bridgelabz.test;

import com.bridgelabz.main.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// RunWith(Parameterized.class)
public class UserRegistrationTest {

    // Given First Name Should Return True
    @Test
    public void whenGivenFirstNameShouldReturnTrueFirst() {
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.checkFirstName("Datta"));
    }

    @Test
    public void whenGivenFirstNameShouldReturnTrueSecond() {
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.checkFirstName("Dattatri"));
    }

    // Given First Name Should Return False
    @Test
    public void whenGivenFirstNameShouldReturnFalseFirst() {
        UserRegistration userRegistration = new UserRegistration();
        assertFalse(userRegistration.checkFirstName("datta"));
    }

    @Test
    public void whenGivenFirstNameShouldReturnFalseSecond() {
        UserRegistration userRegistration = new UserRegistration();
        assertFalse(userRegistration.checkFirstName("DATTATRI"));
    }

    // Given Last Name Should Return True
    @Test
    public void whenGivenLastNameShouldReturnTrueFirst() {
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.checkLastName("Bhure"));
    }

    @Test
    public void whenGivenLastNameShouldReturnTrueSecond() {
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.checkLastName("Bhu"));
    }

    // Given Last Name Should Return False
    @Test
    public void whenGivenLastNameShouldReturnFalseFirst() {
        UserRegistration userRegistration = new UserRegistration();
        assertFalse(userRegistration.checkLastName("bhure"));
    }

    @Test
    public void whenGivenLastNameShouldReturnFalseSecond() {
        UserRegistration userRegistration = new UserRegistration();
        assertFalse(userRegistration.checkLastName("BHURE"));
    }

    // Given MailID Should Return True
    @Test
    public void whenGivenEmailShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.checkLastName("abc@yahoo.com"));
        assertTrue(userRegistration.checkLastName("abc-100@yahoo.com"));
        assertTrue(userRegistration.checkLastName("abc.100@yahoo.com"));
        assertTrue(userRegistration.checkLastName("abc111@abc.com"));
        assertTrue(userRegistration.checkLastName("abc-100@abc.net"));
        assertTrue(userRegistration.checkLastName("abc.100@abc.com.au"));
        assertTrue(userRegistration.checkLastName("abc@1.com"));
        assertTrue(userRegistration.checkLastName("abc@gmail.com.com"));
        assertTrue(userRegistration.checkLastName("abc+100@gmail.com"));
    }

    // Given MailID Should Return False
    @Test
    public void whenGivenEmailShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkEmail("abc"));
        assertFalse(userRegistration.checkEmail("abc@.com.my"));
        assertFalse(userRegistration.checkEmail("abc123@gmail.a"));
        assertFalse(userRegistration.checkEmail("abc123@.com"));
        assertFalse(userRegistration.checkEmail("abc123@.com.com"));
        assertFalse(userRegistration.checkEmail(".abc@abc.com"));
        assertFalse(userRegistration.checkEmail("abc()*@gmail.com"));
        assertFalse(userRegistration.checkEmail("abc@%*.com"));
        assertFalse(userRegistration.checkEmail("abc..2002@gmail.com"));
        assertFalse(userRegistration.checkEmail("abc.@gmail.com"));
        assertFalse(userRegistration.checkEmail("abc@abc@gmail.com"));
        assertFalse(userRegistration.checkEmail("abc@gmail.com.1a"));
        assertFalse(userRegistration.checkEmail("abc@gmail.com.aa.au"));
    }

    // Given Mobile Number Should Return True
    @Test
    public void whenGivenMobileNumberShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.checkMobileNumber("91 9923064024"));
    }

    // Given Mobile Number Should Return False
    @Test
    public void whenGivenMobileNumberShouldReturnFalseFirst(){
        UserRegistration userRegistration = new UserRegistration();
        assertFalse(userRegistration.checkMobileNumber("9923064024"));
    }

    @Test
    public void whenGivenMobileNumberShouldReturnFalseSecond(){
        UserRegistration userRegistration = new UserRegistration();
        assertFalse(userRegistration.checkMobileNumber("9923064abc"));
    }

    // Given Password Should Return True
    @Test
    public void whenGivenPasswordShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.checkPassword("Dattaxyz"));
    }

    // Given Password Should Return False
    @Test
    public void whenGivenPasswordShouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();
        assertFalse(userRegistration.checkPassword("Dattaxyz@123"));
    }
}
