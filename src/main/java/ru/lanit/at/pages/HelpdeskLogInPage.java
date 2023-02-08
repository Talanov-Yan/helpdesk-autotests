package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "LogInPage")
public class HelpdeskLogInPage extends WebPage {

    @Name("Поле логина")
    private SelenideElement userFld = $x("//input[@id='username']");

    @Name("Поле пароля")
    private SelenideElement passwordFld = $x("//input[@id='password']");

    @Name("Кнопка авторизации")
    private SelenideElement loginBtn = $x("//input[@value='Login']");

    @Step("Заполнить поле логина")
    public HelpdeskLogInPage fillUserField(String text) {
        userFld.sendKeys(text);
        return this;
    }

    @Step("Заполнить поле пароля")
    public HelpdeskLogInPage fillPassField(String text) {
        passwordFld.sendKeys(text);
        return this;
    }

    @Step("Нажать кнопку авторизации")
    public HelpdeskLogInPage clickLoginBtn() {
        loginBtn.click();
        return this;
    }
}
