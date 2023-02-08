package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "TicketPage")
public class HelpdeskTicketPage extends WebPage {

    @Name("AllTickets")
    private SelenideElement allTickets = $x("//span[text()=\"All Tickets\"]//..");

    @Name("CheckBoxStatusClose")
    private SelenideElement checkBoxClose = $x("//input[@id=\"st_closed\"]");

    @Name("CheckBoxUpdatePublic")
    private SelenideElement checkBoxUpdate = $x("//input[@name=\"public\"]");

    @Name("BtnUpdateTicket")
    private SelenideElement updateTicketBtn = $x("//button[text() = \"Update This Ticket\"]");

    @Name("Кнопка пиктограммы стрелки")
    private SelenideElement arrowIcons = $x("(//button[@class=\"btn btn-warning btn-sm float-right\"])[2]");

    @Name("Кнопка Subscribe")
    private SelenideElement subscribeBtn = $x("(//button[@class=\"btn btn-warning btn-sm float-right\"])[3]");

    @Step("Активируем чекбокс статуса на Close")
    public HelpdeskTicketPage checkBoxCloseTrue() {
        checkBoxClose.click();
        return this;
    }

    @Step("Нажимаем на чекбокс UpdatePublic")
    public HelpdeskTicketPage clickCheckBoxUpdatePublic() {
        checkBoxUpdate.click();
        return this;
    }

    @Step("Нажимаем кнопку обновить тикет")
    public HelpdeskTicketPage clickUpdateTicketBtn() {
        updateTicketBtn.click();
        return this;
    }

    @Step("Переходим на страницу All Tickets")
    public HelpdeskTicketPage goToAllTickets() {
        allTickets.click();
        return this;
    }
}
