package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    //locators
    //$("#firstName")
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");
    SelenideElement userEmailInput = $("#userEmail");
    SelenideElement genderRadioInput = $("#gender-radio-1");
    SelenideElement userNumberInput = $("#userNumber");
    SelenideElement clickDateOfBirthInput = $("#dateOfBirthInput");
    SelenideElement datePickerMonth = $(".react-datepicker__month-select");
    SelenideElement datePickerYear = $(".react-datepicker__year-select");
    SelenideElement datePickerDay = $(".react-datepicker__day--019");
    SelenideElement PressSubjectsInput = $("#subjectsInput");
    SelenideElement HobbiesCheckbox = $("#hobbies-checkbox-1");
    SelenideElement uploadPictureInput = $("#uploadPicture");
    SelenideElement currentAddressInput = $("#currentAddress");
    SelenideElement stateInput = $("#state");
    SelenideElement cityInput = $("#city");
    SelenideElement submitButton= $("#submit");

    //Проверка формы
    SelenideElement headerResultTable= $("#example-modal-sizes-title-lg");
    SelenideElement resultTable= $(".table-responsive");
    SelenideElement CloseTable= $("#closeLargeModal");






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
    public void clickYear() {

        datePickerYear.click();
    }

    // для выбора года
    public void selectYear(String text) {

        datePickerYear.selectOption(text);
    }

    // для клика по дню в календаре
    public void clickDay() {

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

    //загрузка файла
    public void uploadFilePicture(String fileName) {

        uploadPictureInput.uploadFromClasspath(fileName);
    }

    //Заполнить адрес
    public void setСurrentAddress(String currentAddress) {

        currentAddressInput.setValue(currentAddress);
    }

    //нажать на всплывающий список штатов
    public void clickState() {

        stateInput.scrollTo().click();
    }

    //найти тескт со штатом и кликнуть
    public void formState(String fieldState) {

        stateInput.$(byText(fieldState)).click();
    }

    //нажать на всплывающий городов
    public void clickСity() {

        cityInput.scrollTo().click();
    }

    //найти тескт с городом и кликнуть
    public void formCity(String fieldCity) {

        cityInput.$(byText(fieldCity)).click();
    }

    //нажать на батон сабмит
    public void clickSubmitButton() {

        submitButton.click();
    }
    //проверить, что есть сообщение в заголовке
    public void checkHeaderResultTable(String headerText) {

        headerResultTable.shouldHave(text(headerText));
    }
    //проверка таблицы значений
    public void checkForm(String fieldName, String value) {

        resultTable.$(byText(fieldName))
                .parent().shouldHave(text(value));

    }
    //нажать на батон закрыть
    public void clickCloseTable() {

        CloseTable.click();
    }

}

