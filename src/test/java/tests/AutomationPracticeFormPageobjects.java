package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import java.io.File;


import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class AutomationPracticeFormPageobjects {
    RegistrationPage registrationPage = new RegistrationPage();
    String firstName = "Mick";

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

    }

    @Test
    void successFillTest() {
        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName("Ivanov")
                .setUserEmail("ivanov@company.com")
                .clickGenderRadio()
                .setUserNumber("89995554411")
                .clickdateOfBirth()
                .clickMonth()
                .selectMonth(3)
                .clickMonth()
                .clickYear()
                .selectYear("1990")
                .clickDay()
                .subjectsInput("Arts")
                .hobbies()
                .uploadFilePicture("test.jpg")
                .setСurrentAddress("some address")
                .clickState()
                .formState("Rajasthan")
                .clickСity()
                .formCity("Jaiselmer")
                .clickSubmitButton()

                .checkHeaderResultTable("Thanks for submitting the form")

                .checkForm("Student Name", firstName + " Ivanov")
                .checkForm("Student Email", "ivanov@company.com")
                .checkForm("Gender", "Male")
                .checkForm("Mobile", "8999555441")
                .checkForm("Date of Birth", "9 April,1990")
                .checkForm("Subjects", "Arts")
                .checkForm("Hobbies", "Sports")
                .checkForm("Picture", "test.jpg")
                .checkForm("Address", "some address")
                .checkForm("State and City", "Rajasthan Jaiselmer")
                .clickCloseTable();


    }


}
