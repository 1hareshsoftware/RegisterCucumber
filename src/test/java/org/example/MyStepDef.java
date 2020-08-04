package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.BasePage;
import org.HomePage;
import org.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyStepDef extends BasePage {

    HomePage homePage = new HomePage();
    RegisterPage registerpage = new RegisterPage();

    @Given("^I m on Home page$")
    public void i_m_on_Home_page() {
        //url asseert
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://demo.nopcommerce.com/");
        System.out.println("Welcome to our store");
    }

    @When("^I click on register Button$")
    public void i_click_on_register_Button() {
        homePage.registerBtn();
        //register page assert
    }

    @When("^I click on gender$")
    public void i_click_on_gender() {
        registerpage.maleGenderButton();
    }

    @When("^I enter the First Name$")
    public void i_enter_the_First_Name() {
        registerpage.enterFirstName();
    }

    @When("^I enter last name$")
    public void i_enter_last_name(){
        registerpage.enterLastName();
    }

    @When("^I enter date of birth$")
    public void i_enter_date_of_birth(){
        registerpage.enterDateOfBirth();
    }

    @When("^I enter my email address$")
    public void i_enter_my_email_address() {
        registerpage.email();
    }

    @When("^I enter Company name$")
    public void i_enter_Company_name(){
        registerpage.companyName();
    }

    @When("^I enter password$")
    public void i_enter_password() {
        registerpage.password();
    }

    @When("^I enter confirm password$")
    public void i_enter_confirm_password() {
        registerpage.confirmPassword();
    }

    @When("^I click on registration button$")
    public void i_click_on_registration_button() {
        registerpage.register();
    }

    @Then("^I register succesfully amd i should be able to see welcome massage$")
    public void i_register_succesfully_amd_i_should_be_able_to_see_welcome_massage() {
        String registersuccesfully = driver.findElement(By.className("page-title")).getText();
        Assert.assertEquals(registersuccesfully, "Register");
        System.out.println("Your registration completed");
        //assert for final registration message
    }

    }