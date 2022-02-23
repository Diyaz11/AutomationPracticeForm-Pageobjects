package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    //locators
    private SelenideElement
            headerTitle = $(".main-header"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderRadioInput = $("#gender-radio-1"),
            userNumberInput = $("#userNumber"),
            clickDateOfBirthInput = $("#dateOfBirthInput"),
            datePickerMonth = $(".react-datepicker__month-select"),
            datePickerYear = $(".react-datepicker__year-select"),
            datePickerDay = $(".react-datepicker__day--019"),
            PressSubjectsInput = $("#subjectsInput"),
            HobbiesCheckbox = $("#hobbies-checkbox-1"),
            uploadPictureInput = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            submitButton = $("#submit"),
            headerResultTable = $("#example-modal-sizes-title-lg"), //Проверка формы
            resultTable = $(".table-responsive"),
            CloseTable = $("#closeLargeModal");


    //actions
    //Описание действий с селектором
    public RegistrationPage openPage() {
        open("/automation-practice-form");
        headerTitle.shouldHave(text("Practice Form"));
        return this;
    }
    public RegistrationPage setFirstName(String firstName) {

        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {

        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setUserEmail(String userEmail) {

        userEmailInput.setValue(userEmail);
        return this;
    }

    // для клика по джендеру
    public RegistrationPage clickGenderRadio() {

        genderRadioInput.parent().click();
        return this;
    }

    public RegistrationPage setUserNumber(String userNumber) {

        userNumberInput.setValue(userNumber);
        return this;
    }

    // для клика по календарю
    public RegistrationPage clickdateOfBirth() {

        clickDateOfBirthInput.click();
        return this;
    }

    // для клика по месяцу в календаре
    public RegistrationPage clickMonth() {

        datePickerMonth.click();
        return this;
    }

    // для выбора месяца
    public RegistrationPage selectMonth(int i) {

        datePickerMonth.selectOption(i);
        return this;
    }

    // для клика по году в календаре
    public RegistrationPage clickYear() {

        datePickerYear.click();
        return this;
    }

    // для выбора года
    public RegistrationPage selectYear(String text) {

        datePickerYear.selectOption(text);
        return this;
    }

    // для клика по дню в календаре
    public RegistrationPage clickDay() {

        datePickerDay.click();
        return this;
    }

    //задать значение в графе subjects
    public RegistrationPage subjectsInput(String subjectsInput) {

        PressSubjectsInput.setValue(subjectsInput).pressEnter();
        return this;
    }

    // для чек-бокса хобби
    public RegistrationPage hobbies() {

        HobbiesCheckbox.parent().click();
        return this;
    }

    //загрузка файла
    public RegistrationPage uploadFilePicture(String fileName) {

        uploadPictureInput.uploadFromClasspath(fileName);
        return this;
    }

    //Заполнить адрес
    public RegistrationPage setСurrentAddress(String currentAddress) {

        currentAddressInput.setValue(currentAddress);
        return this;
    }

    //нажать на всплывающий список штатов
    public RegistrationPage clickState() {

        stateInput.scrollTo().click();
        return this;
    }

    //найти тескт со штатом и кликнуть
    public RegistrationPage formState(String fieldState) {

        stateInput.$(byText(fieldState)).click();
        return this;
    }

    //нажать на всплывающий городов
    public RegistrationPage clickСity() {

        cityInput.scrollTo().click();
        return this;
    }

    //найти тескт с городом и кликнуть
    public RegistrationPage formCity(String fieldCity) {

        cityInput.$(byText(fieldCity)).click();
        return this;
    }

    //нажать на батон сабмит
    public RegistrationPage clickSubmitButton() {

        submitButton.click();
        return this;
    }

    //проверить, что есть сообщение в заголовке
    public RegistrationPage checkHeaderResultTable(String headerText) {

        headerResultTable.shouldHave(text(headerText));
        return this;
    }

    //проверка таблицы значений
    public RegistrationPage checkForm(String fieldName, String value) {

        resultTable.$(byText(fieldName))
                .parent().shouldHave(text(value));
        return this;
    }

    //нажать на батон закрыть
    public RegistrationPage clickCloseTable() {

        CloseTable.click();
        return this;
    }

}

