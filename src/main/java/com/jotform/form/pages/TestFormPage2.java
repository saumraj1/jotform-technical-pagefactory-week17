package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class TestFormPage2 extends Utility {

    public TestFormPage2() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "first_3")
    WebElement firstName;

    @FindBy (id = "last_3")
    WebElement lastName;

    @FindBy (xpath = "//div[@data-type='control_fullname']"  +
                       "//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement testFormNextButton;

    public void enterFirstNameInTheFirstNameField(String name){
        Reporter.log("Enter the first name : " + name + "<br>");
       sendTextToElement(firstName, name);
    }

    public void enterLastNameInTheLastNameField(String lname) {
        Reporter.log("Enter the last name : " + lname + "<br>");
        sendTextToElement(lastName, lname);
    }

    public void clickOnNextButtonOnTestFormPage(){
        Reporter.log("Click on the next button on test form page : " + testFormNextButton.toString() + "<br>");
        clickOnElement(testFormNextButton);
    }
}
