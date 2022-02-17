package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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

//Проверка ввода значений и клика кнопок
        $("#firstName").setValue("Mick");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("ivanov@company.com");
        $("#gender-radio-1").parent().click();
        $("#userNumber").setValue("89995554411");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption(3);
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--019").click();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
        $("#uploadPicture").uploadFile(new File("test.jpg")); //не уверен, что так правильно, добавил jgp в папку с проектом и оттуда беру файл
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
