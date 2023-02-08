package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "HomePage")
public class HelpdeskHomePage extends WebPage {

    @Name("Кнопка Log In")
    private SelenideElement btnLogIn = $x("//a[@id=\"userDropdown\"]");

    @Step("Нажать кнопку для перехода на страницу LoginPage")
    public HelpdeskHomePage clickLogInBtn() {
        btnLogIn.click();
        return this;
    }
}

