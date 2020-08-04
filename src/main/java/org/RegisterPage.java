package org;

import org.openqa.selenium.By;

import static org.Utils.utils.*;

public class RegisterPage extends Utils {
    LoadProp loadprop = new LoadProp();

    private By maleGender = By.id("gender-male");
    private By enterFirstName = By.id("FirstName");
    private By _enterLastName = By.id("LastName");
    private By _enterDayOfBirth = By.xpath("//div[@class='date-picker-wrapper']/select[1]");
    private By _enterMonthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _enterYearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");
    private By _email = By.id("Email");
    private By _companyName = By.id("Company");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _register = By.id("register-button");

    public void maleGenderButton() {
        ClickOnElement(maleGender);
    }

    public void enterFirstName() {
        enterText(enterFirstName, loadprop.getProperty("Firstname"));
    }

    public void enterLastName() {
        enterText(_enterLastName, loadprop.getProperty("Lastname"));
    }

    public void enterDateOfBirth() {
        SelectByVisibleText(_enterDayOfBirth, loadprop.getProperty("Day"));
        SelectByVisibleText(_enterMonthOfBirth, loadprop.getProperty("Month"));
        SelectByVisibleText(_enterYearOfBirth, loadprop.getProperty("Year"));
    }

    public void email() {
        enterText(_email, loadprop.getProperty("Email"));
    }

    public void companyName() {
        enterText(_companyName, loadprop.getProperty("Companyname"));
    }

    public void password (){
        enterText(_password, loadprop.getProperty("Password"));
    }

    public void confirmPassword () {
        enterText(_confirmPassword, loadprop.getProperty("Confirmpassword"));
    }

    public void register (){
        ClickOnElement(_register);
    }
}

