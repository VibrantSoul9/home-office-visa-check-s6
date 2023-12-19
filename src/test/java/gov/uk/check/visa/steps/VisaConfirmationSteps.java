package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage()
    {

    }

    @When("I click on start button")
    public void iClickOnStartButton()
    {
        new StartPage().clickOnStartButton();
    }

    @And("I Select a Nationality {string}")
    public void iSelectANationalityAustralia()
    {
        new SelectNationalityPage().selectNationality("Australia");
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton()
    {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I Select reason Tourism")
    public void iSelectReasonTourism()
    {
        new ReasonForTravelPage().selectReasonForAustralia();
    }

    @Then("verify result {string}")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK()
    {
        Assert.assertEquals(new ResultPage().getResultMessageTourism(), "You will not need a visa to come to the UK" ,"Message displayed");
    }

    @And("Select reason Work, academic visit or business")
    public void selectReasonWorkAcademicVisitOrBusiness()
    {
        new ReasonForTravelPage().selectReasonForChile();
    }

    @When("Select intendent to stay for longer than {int} months")
    public void selectIntendentToStayForLongerThanMonths(int arg0)
    {
        new DurationOfStayPage().selectMoreThen6months();
    }

    @And("Select have planning to work for Health and care professional")
    public void selectHavePlanningToWorkForHealthAndCareProfessional()
    {
        new WorkTypePage().selectJobType();
    }

    @Then("verify result of{string}")
    public void verifyResultOfYouNeedAVisaToWorkInHealthAndCare()
    {
        Assert.assertEquals(new ResultPage().getResultMessageHealthcare(), "You need a visa to work in health and care" , "Message displayed");
    }

    @And("Select a Nationality {string}")
    public void selectANationalityColombia()
    {
        new SelectNationalityPage().selectNationality("Columbia");
    }

    @And("Select reason Join partner or family for a long stay")
    public void selectReasonJoinPartnerOrFamilyForALongStay()
    {
        new ReasonForTravelPage().selectReasonForColombia();
    }

    @Then("To get verify result {string}")
    public void toGetVerifyResultYouMayNeedAVisa()
    {
        Assert.assertEquals(new ResultPage().getResultMessageFamilyStay(), "'You’ll need a visa to join your family or partner in the UK" , "Message displayed");
    }
}
