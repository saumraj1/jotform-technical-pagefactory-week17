package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage1 extends Utility {


    public HomePage1() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "#jfCard-welcome-start")
    WebElement nextButton;


    public void clickOnNextButton(){
        Reporter.log("Click on the Next Button : " + nextButton.toString() + "<br>");
        clickOnElement(nextButton);
    }


}
