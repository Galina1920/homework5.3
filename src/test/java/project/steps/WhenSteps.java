package project.steps;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import project.action.CommonActions;
import project.browser.Driver;
import project.pages.StudentRegistrationForm;

import java.util.List;

public class WhenSteps {
    StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm(Driver.getDriver());
    CommonActions commonActions = new CommonActions();


    @When("user complete form with valid data")
    public void completeFormWithValidData (DataTable dataTable) {
        List<String> insertvalue= dataTable.asList();

        studentRegistrationForm.getFirstName().sendKeys(insertvalue.get(0));
        studentRegistrationForm.getLastName().sendKeys(insertvalue.get(1));
        studentRegistrationForm.getUserEmail().sendKeys(insertvalue.get(2));
        studentRegistrationForm.getGenderButtons(insertvalue.get(3)).click();
        studentRegistrationForm.getPhoneNumber().sendKeys(insertvalue.get(4));
        studentRegistrationForm.getSubjectInput().sendKeys(insertvalue.get(5));
//        studentRegistrationForm.getHobbieCheckbox(insertvalue.get(6)).click();
        studentRegistrationForm.getTextArea().sendKeys(insertvalue.get(7));

    }


    @When("upload an image")
    public void uploadImage(){
        studentRegistrationForm.getUploadPicture().
                sendKeys("D:\\Galina\\QA\\Descarcari\\image.png");
    }

    @When("click on submit button")
    public void clickOnSubmitButton(){
        commonActions.scrollToElement(studentRegistrationForm.getSubmitButton());
        studentRegistrationForm.getSubmitButton().click();
    }

}
