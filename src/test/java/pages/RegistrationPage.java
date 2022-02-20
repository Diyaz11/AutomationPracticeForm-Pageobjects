package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    //locators
    //$("#firstName")
    SelenideElement firstNameInput =$("#firstName");
    SelenideElement lastNameInput =$("#lastName");
    SelenideElement userEmailInput =$("#userEmail");
    SelenideElement genderRadioInput =$("#gender-radio-1");
    SelenideElement userNumberInput =$("#userNumber");
    SelenideElement clickDateOfBirthInput =$("#dateOfBirthInput");
    SelenideElement datePickerMonth =$(".react-datepicker__month-select");
    SelenideElement datePickerYear =$(".react-datepicker__year-select");
    SelenideElement datePickerDay =$(".react-datepicker__day--019");
    SelenideElement PressSubjectsInput =$("#subjectsInput");
    SelenideElement HobbiesCheckbox =$("#hobbies-checkbox-1");



    //actions
    //Описание действий с селектором
    public void setFirstName(String firstName) {

        firstNameInput.setValue(firstName);
    }

    public void setLastName(String lastName) {

        lastNameInput.setValue(lastName);

    }
    public void setUserEmail(String userEmail) {

        userEmailInput.setValue(userEmail);
    }
    // для клика по джендеру
    public void clickGenderRadio() {

        genderRadioInput.parent().click();
    }
    public void setUserNumber(String userNumber) {

        userNumberInput.setValue(userNumber);
    }
    // для клика по календарю
    public void clickdateOfBirth() {

        clickDateOfBirthInput.click();
    }
    // для клика по месяцу в календаре
    public void clickMonth() {

        datePickerMonth.click();
    }

    // для выбора месяца
    public void selectMonth(int i) {

        datePickerMonth.selectOption(i);
    }
    // для клика по году в календаре
    public void clickyear() {

        datePickerYear.click();
    }
    // для выбора года
    public void selectYear(String text) {

        datePickerYear.selectOption(text);
    }
    // для клика по дню в календаре
    public void clickday() {

        datePickerDay.click();
    }
    //задать значение в графе subjects
    public void subjectsInput(String subjectsInput) {

        PressSubjectsInput.setValue(subjectsInput).pressEnter();
    }
    // для чек-бокса хобби
    public void hobbies() {

        HobbiesCheckbox.parent().click();
    }

}
