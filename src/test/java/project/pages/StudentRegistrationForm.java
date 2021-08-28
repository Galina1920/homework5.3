package project.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class StudentRegistrationForm {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement userEmail;

    @FindBy(xpath = "//div[contains(@class, 'custom-control custom-radio custom-control-inline')]")
    private List<WebElement> genderButtons;

    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[contains(@id, 'subjectsInput')]")
    private WebElement subjectInput;

//    @FindBy(xpath = "//label[contains(@class, 'custom-control-label')]")
//    private List<WebElement> hobbieCheckbox;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    private WebElement uploadPicture;

    @FindBy(xpath = "//textarea")
    private WebElement textArea;

    @FindBy(xpath = "//div[contains(@class, 'css-yk16xz-control')]")
    private WebElement stateDropDown;

    @FindBy(xpath = "//div[contains(@class, 'css-14jk2my-container')]")
    private WebElement cityDropDown;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[contains(@class, 'al-body')]")
    private WebElement popup;

    public StudentRegistrationForm(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver1,this);
    }

//    public WebElement getPopup() {
//        return popup;
//    }
//
//    public WebElement getFirstName() {
//        return firstName;
//    }
//
//    public WebElement getLastName() {
//        return lastName;
//    }

//    public WebElement getUserEmail() {
//        return userEmail;
//    }

    public WebElement getGenderButtons(String gender) {
        return genderButtons.stream().filter(element -> element.getText().equals(gender)).findFirst()
                .orElseThrow(()-> new RuntimeException("Such gender does not exist - " + gender));
    }


//    public WebElement getUserNumber() {
//        return phoneNumber;
//    }
//
//    public WebElement getSubjectInput() {
//        return subjectInput;
//    }

//    public WebElement getHobbieCheckbox(String hobby) {
//        return hobbieCheckbox.stream().filter(element -> element.getText().equals(hobby))
//                .findFirst()
//                .orElseThrow(()-> new RuntimeException("Such hobby does not exist - " + hobby));
//    }

//    public WebElement getUploadPicture() {
//        return uploadPicture;
//    }
//
//    public WebElement getTextArea() {
//        return textArea;
//    }
//
//    public WebElement getStateDropDown() {
//        return stateDropDown;
//    }
//
//    public WebElement getCityDropDown() {
//        return cityDropDown;
//    }
//
//    public WebElement getSubmitButton() {
//        return submitButton;
//    }
}
