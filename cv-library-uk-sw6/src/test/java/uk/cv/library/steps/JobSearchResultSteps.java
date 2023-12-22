package uk.cv.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.cv.library.pages.HomePage;
import uk.cv.library.pages.ResultPage;

public class JobSearchResultSteps {

    //Given     I am on Homepage
    @Given("I am on Homepage")
    public void iAmOnHomepage() {
        new HomePage().clickOnAcceptAllButton();
    }

    //When      I enter job title "<jobTitle>"
    @When("I enter job title {string}")
    public void iEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    //And       I enter Location "<location>"
    @And("I enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    //And       I select distance "<distance>"
    @And("I select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    //And       I click on more Search Options Link
    @And("I click on more Search Options Link")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    //And       I enter salaryMin "<salaryMin>"
    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    //And       I enter salaryMax "<salaryMax>"
    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    //And       I select salaryType "<salaryType>"
    @And("I select salaryType {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    //And       I select jobType "<jobType>"
    @And("I select jobType {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    //And       I click on Find Jobs button
    @And("I click on Find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    //Then      I verify the result "<result>"
    @Then("I verify the result {string}")
    public void iVerifyTheResult(String result) {
        new ResultPage().verifyTheResulTextOnResultPage(result);
    }
}
