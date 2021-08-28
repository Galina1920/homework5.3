package project.steps;

import cucumber.api.java.en.Given;
import project.browser.Driver;

public class GivenSteps {

    @Given("user is at {string} page")
    public void userOpenLink(String pageLink){
        Driver.getDriver().get(pageLink);
    }
}
