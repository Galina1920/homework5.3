package project.steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import project.browser.Driver;
import project.pages.StudentRegistrationForm;

public class ThenSteps {

    StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm(Driver.getDriver());

    @Then("a popup is displayed")
    public void popupDisplayed(){
        Assert.assertTrue("Popup displayed",studentRegistrationForm.getPopup().isDisplayed());
    }
}
