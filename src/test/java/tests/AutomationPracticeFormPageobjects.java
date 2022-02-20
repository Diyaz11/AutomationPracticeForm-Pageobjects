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
        //$("#firstName").setValue("Mick");
        new RegistrationPage().setLastName("Ivanov");
        new RegistrationPage().setUserEmail("ivanov@company.com");
        new RegistrationPage().clickGenderRadio();
        new RegistrationPage().setUserNumber("89995554411");
        new RegistrationPage().clickdateOfBirth();
        new RegistrationPage().clickMonth();
        new RegistrationPage().selectMonth(3);
        new RegistrationPage().clickMonth();
        new RegistrationPage().clickyear();
        new RegistrationPage().selectYear("1990");
        new RegistrationPage().clickday();
        new RegistrationPage().subjectsInput("Arts");
        new RegistrationPage().hobbies();
        //("#subjectsInput").setValue("Arts").pressEnter();
        //$("#hobbies-checkbox-1").parent().click();
        $("#uploadPicture").uploadFile(new File("test.jpg"));
        $("#currentAddress").setValue("some address");
        $("#state").scrollTo().click();
        $("#state").$(byText("Rajasthan")).click();
        $("#city").scrollTo().click();
        $("#city").$(byText("Jaiselmer")).click();
        $("#submit").click();
//Добавил проверку после заполенения форм, что все значения есть в таблице
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text("Mick Ivanov"),
                text("ivanov@company.com"),
                text("Male"),
                text("8999555441"),
                text("9 April,1990"),
                text("Arts"),
                text("Sports"),
                text("test.jpg"),
                text("some address"),
                text("Rajasthan Jaiselmer")
        );
        $("#closeLargeModal").click();

    }


}
