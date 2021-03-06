package com.bridgelab.demo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateFirstAndLastName("Shraddha");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenFirstName_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateFirstAndLastName("shraddha");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateFirstAndLastName("Meshram");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenLastName_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateFirstAndLastName("meshram");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateEmail("abc@yahoo.com");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenEmail_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateEmail("abc@%*.com");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateMobileNumber("91 8776655434");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenMobileNumber_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateMobileNumber("916576576");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenPasswordStartWithEightCharacter_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateEightCharacterPassword("Workaholic");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenPasswordStartWithEightCharacter_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateEightCharacterPassword("workaholic3452");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenPasswordContainsAtLeastOneUppperCaseCharacter_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneCapitalLetter("WorkAholic");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenPasswordContainsAtLeastOneUppperCaseCharacter_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneCapitalLetter("hackerwork");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenPasswordContainsAtLeastOneNumericCharacter_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneNumericNumber("WorkAholic2341");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenPasswordContainsAtLeastOneNumericCharacter_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneNumericNumber("unboundcodes");
        Assert.assertEquals("Invalid",result);
    }
    @Test
    public void givenPasswordContainsExactlyOneSpecialCharacter_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneSpecialCharacter("@WorkAholic2341");
        Assert.assertEquals("Valid",result);
    }
    @Test
    public void givenPasswordContainsExactlyOneSpecialCharacter_WhenInproper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validatePasswordWithAtLeastOneSpecialCharacter("@#unboun@dcodes");
        Assert.assertEquals("Invalid",result);
    }
}
