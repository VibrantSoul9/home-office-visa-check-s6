package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());
    //nextStepButton, lessThanSixMonths, moreThanSixMonths locators

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    //create methods 'void selectLengthOfStay(String moreOrLess)'
    // (Note: use switch statement for select moreOrLess stay) and 'void clickNextStepButton()'

    public void select6monthsOrLess() {
        log.info("select 6 months or less");
        clickOnElement(lessThanSixMonths);
    }

    public void selectMoreThen6months(){
        log.info("Select More Then 6months");
        clickOnElement(moreThanSixMonths);
    }

    public void clickNextStepButton() {
        log.info("click next step button");


        clickOnElement(nextStepButton);

    }
}
