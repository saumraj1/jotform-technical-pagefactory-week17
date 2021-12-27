package com.jotform.form.testsuite;

import com.jotform.form.pages.*;
import com.jotform.form.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;


public class TechnicalTest extends TestBase {

    HomePage1 homePage1;
    TestFormPage2 testFormPage2;
    BrowseAndDropFilesPage3 browseAndDropFilesPage3;
    SignaturePage4 signaturePage4;
    DatePage5 datePage5 ;
    SecurityQuestionPage6 securityQuestionPage6;
    FinalPage7 finalPage7;

    @BeforeMethod
    public void init(){
        homePage1 = new HomePage1();
        testFormPage2 = new TestFormPage2();
        browseAndDropFilesPage3 = new BrowseAndDropFilesPage3();
        signaturePage4 = new SignaturePage4();
       datePage5 = new DatePage5();
        securityQuestionPage6 = new SecurityQuestionPage6();
        finalPage7 = new FinalPage7();
    }

    @Test
    @Parameters({"firstName", "lastName", "securityQuestion", "securityAnswer", "expectedMessage"})
    public void technicalTest(String fn, String ln, String sq, String sa, String em) throws AWTException, InterruptedException {
        //click on the next button of the home page to navigate to test form page
        homePage1.clickOnNextButton();
        //Enter firstname in the firstname field
       testFormPage2.enterFirstNameInTheFirstNameField(fn);
        //Enter last name in the last name field
        testFormPage2.enterLastNameInTheLastNameField(ln);
        //Click on the next button
        testFormPage2.clickOnNextButtonOnTestFormPage();
        //attach file
        browseAndDropFilesPage3.uploadFile("C:\\Users\\laxmi\\Desktop\\TestDoc.docx");
        //create a signature
        signaturePage4.createSignature();
        //click on next Button
        signaturePage4.clickOnNextButton();
        //enter the date
        datePage5.selectDate();
        //click on the next button
       datePage5.clickOnNext();
        //select the security question
        securityQuestionPage6.selectFromDropDown(sq);
        //answer the question
        securityQuestionPage6.enterSecurityAnswer(sa);
        //click on submit button
        securityQuestionPage6.clickOnSubmitButton();
        //verify that the submission has been received
        finalPage7.verifyThatSubmissionHasBeenReceived(em);
    }
}
