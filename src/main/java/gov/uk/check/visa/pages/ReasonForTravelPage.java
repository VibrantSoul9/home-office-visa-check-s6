package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());
    //nextStepButton, reasonForVisitList locators

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement reasonForAustralia;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement reasonForChile;

    @CacheLookup
    @FindBy(id = "response-4")
    WebElement reasonForColombia;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    //create methods  'void selectReasonForVisit(String reason and  'void clickNextStepButton()'

    public void selectReasonForAustralia() {
        log.info("select Reason for Australia");
        clickOnElement(reasonForAustralia);
    }

    public void selectReasonForChile() {
        log.info("select reason for chile");
        clickOnElement(reasonForChile);

    }

    public void selectReasonForColombia() {
        log.info("select reason for colombia");

        clickOnElement(reasonForColombia);

    }

    public void clickContinueButton() {
        log.info("select reason for colombia");

        clickOnElement(continueButton);

    }
}
