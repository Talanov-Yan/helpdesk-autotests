package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "CCSettingsPage")
public class HelpdeskTicketCCSettings extends WebPage {

    @Name("Кнопка AddEmailOrHelpdeskUser")
    private SelenideElement addEmailOrHelpdeskUserBtn = $x("//button[@class=\"btn btn-success btn-sm\"]");

    @Name("Ссылка good_website")
    private SelenideElement linkGoodWebsite = $x("//*[@id=\"content-wrapper\"]/div/p[1]/em");

    @Name("Кнопка Return To")
    private SelenideElement returnToBtn = $x("//button[@class=\"btn btn-primary btn-lg\"]");

    @Name("Кнопка Delete")
    private SelenideElement deleteBtn = $x("//button[@class=\"btn btn-danger btn-xs\"]");
}
