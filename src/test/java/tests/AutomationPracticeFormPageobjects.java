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

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

    }

    @Test
    void successFillTest() {
        open("/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));

//Проверки
        new RegistrationPage().setFirstName("Mick");
        new RegistrationPage().setLastName("Ivanov");
        new RegistrationPage().setUserEmail("ivanov@company.com");
        new RegistrationPage().clickGenderRadio();
        new RegistrationPage().setUserNumber("89995554411");
        new RegistrationPage().clickdateOfBirth();
        new RegistrationPage().clickMonth();
        new RegistrationPage().selectMonth(3);
        new RegistrationPage().clickMonth();
        new RegistrationPage().clickYear();
        new RegistrationPage().selectYear("1990");
        new RegistrationPage().clickDay();
        new RegistrationPage().subjectsInput("Arts");
        new RegistrationPage().hobbies();
        new RegistrationPage().uploadFilePicture("test.jpg");
        new RegistrationPage().setСurrentAddress("some address");
        new RegistrationPage().clickState();
        new RegistrationPage().formState("Rajasthan");
        new RegistrationPage().clickСity();
        new RegistrationPage().formCity("Jaiselmer");
        new RegistrationPage().clickSubmitButton();

        new RegistrationPage().checkHeaderResultTable("Thanks for submitting the form");

        new RegistrationPage().checkForm("Student Name", "Mick Ivanov");
        new RegistrationPage().checkForm("Student Email", "ivanov@company.com");
        new RegistrationPage().checkForm("Gender", "Male");
        new RegistrationPage().checkForm("Mobile", "8999555441");
        new RegistrationPage().checkForm("Date of Birth", "9 April,1990");
        new RegistrationPage().checkForm("Subjects", "Arts");
        new RegistrationPage().checkForm("Hobbies", "Sports");
        new RegistrationPage().checkForm("Picture", "test.jpg");
        new RegistrationPage().checkForm("Address", "some address");
        new RegistrationPage().checkForm("State and City", "Rajasthan Jaiselmer");
        new RegistrationPage().clickCloseTable();


    }


}
