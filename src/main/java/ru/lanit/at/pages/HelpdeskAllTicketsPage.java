package ru.lanit.at.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.Select;
import ru.lanit.at.actions.WebActions;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "AllTicketsPage")
public class HelpdeskAllTicketsPage extends WebPage {

    @Name("Поле поиска")
    private SelenideElement inputSearch = $x("//input[@id = \"search_query\"]");

    @Name("Кнопка Go")
    private SelenideElement btnGo = $x("(//button[@type = \"submit\"])[1]");

    @Name("Column visibility")
    private SelenideElement btnClmVisible = $x("//span[text() = \"Column visibility\"]");

    @Name("Select")
    private SelenideElement btnSelect = $x("//button[@data-cv-idx=\"0\"]");

    @Name("Ticket")
    private SelenideElement btnTicket = $x("//button[@data-cv-idx=\"1\"]");

    @Name("Priority")
    private SelenideElement btnPriority = $x("//button[@data-cv-idx=\"2\"]");

    @Name("Queue")
    private SelenideElement btnQueue = $x("//button[@data-cv-idx=\"3\"]");

    @Name("Status")
    private SelenideElement btnStatus = $x("//button[@data-cv-idx=\"4\"]");

    @Name("Created")
    private SelenideElement btnCreated = $x("//button[@data-cv-idx=\"5\"]");

    @Name("DueDate")
    private SelenideElement btnDueDate = $x("//button[@data-cv-idx=\"6\"]");

    @Name("Owner")
    private SelenideElement btnOwner = $x("//button[@data-cv-idx=\"7\"]");

    @Name("Submitter")
    private SelenideElement btnSubmitter = $x("//button[@data-cv-idx=\"8\"]");

    @Name("TimeSpent")
    private SelenideElement btnTimeSpent = $x("//button[@data-cv-idx=\"9\"]");

    @Name("KBItem")
    private SelenideElement btnKBItem = $x("//button[@data-cv-idx=\"10\"]");

    @Name("btnBackground")
    private SelenideElement btnBackground = $x("//div[@class = \"dt-button-background\"]");

    @Name("TableTicket")
    private SelenideElement tableTicket = $x("//th[contains(text(), \"Ticket\")]");

    @Name("TablePriority")
    private SelenideElement tablePriority = $x("//th[contains(text(), \"Priority\")]");

    @Name("TableQueue")
    private SelenideElement tableQueue = $x("//th[contains(text(), \"Queue\")]");

    @Name("TableStatus")
    private SelenideElement tableStatus = $x("//th[contains(text(), \"Status\")]");

    @Name("TableCreated")
    private SelenideElement tableCreated = $x("//th[contains(text(), \"Created\")]");

    @Name("TableDueDate")
    private SelenideElement tableDueDate = $x("//th[contains(text(), \"Due Date\")]");

    @Name("TableOwner")
    private SelenideElement tableOwner = $x("//th[contains(text(), \"Owner\")]");

    @Name("TableSubmitter")
    private SelenideElement tableSubmitter = $x("//th[contains(text(), \"Submitter\")]");

    @Name("TableTimeSpent")
    private SelenideElement tableTimeSpent = $x("//th[contains(text(), \"Time Spent\")]");

    @Name("TableKBItem")
    private SelenideElement tableKBItem = $x("//th[contains(text(), \"KB item\")]");

    @Name("TimeLine")
    private SelenideElement timeLine = $x("//a[@id = \"timelinetabcontents-tab\"]");

    @Name("More")
    private SelenideElement more = $x("(//div[@class=\"tl-slidenav-icon\"])[1]");

    @Name("Less")
    private SelenideElement less = $x("(//div[@class=\"tl-slidenav-icon\"])[2]");

    @Name("Table")
    private SelenideElement table = $x("//a[@id=\"datatabletabcontents-tab\"]");

    @Name("TicketTitle")
    private SelenideElement ticketTitle = $x("//*[@id=\"ticketTable\"]/tbody/tr[1]/td[2]/div");

    @Name("ShowEntries")
    private SelenideElement showEntries = $x("//select[@name=\"ticketTable_length\"]");

    @Name("PageLink2")
    private SelenideElement pageLink2 = $x("//a[text() ='2']");

    @Name("PageNext")
    private SelenideElement pageLinkNext = $x("//a[text() ='Next']");

    @Name("Чекбокс тикета1")
    private SelenideElement checkBoxTicketFirst = $x("//*[@id=\"ticketTable\"]/tbody/tr[10]//input");

    @Name("Чекбокс тикета2")
    private SelenideElement checkBoxTicketSecond = $x("//*[@id=\"ticketTable\"]/tbody/tr[9]//input");

    @Name("SelectAction")
    private SelenideElement selectAction = $x("//select[@id=\"id_mass_action\"]");

    @Name("Кнопка Go для with selected tickets")
    private SelenideElement btnGoWST = $x("(//button[@type= \"submit\"])[2]");

    @Name("TicketTitleInTable")
    private SelenideElement clickTicketTitle = $x("//*[@id=\"ticketTable\"]/tbody/tr[6]/td[2]/div/a");

    @Name("TicketTitleInTableTwo")
    private SelenideElement clickTicketTitleTwo = $x("//*[@id=\"ticketTable\"]/tbody/tr[6]/td[2]/div/a");

    @Name("Кнопка Reports")
    private SelenideElement reportsBtn = $x("//span[text()=\"Reports\"]");

    @Name("UserDropdown")
    private SelenideElement userDropdownBtn = $x("//a[@id=\"userDropdown\"]");

    @Name("UserSettingsDropdown")
    private SelenideElement userSettingsDropdown = $x("//*[@id=\"bg-dark\"]/nav/ul/li[2]/div/a[1]");

    @Step("Активируем чекбокс")
    public HelpdeskAllTicketsPage setCheckBox() {
        checkBoxTicketFirst.shouldBe(Condition.enabled, Duration.ofSeconds(60));
        WebActions.setCheckBox(checkBoxTicketFirst, true);
        return this;
    }

    @Step("Активируем два чекбокса")
    public HelpdeskAllTicketsPage setTwoCheckBox() {
        checkBoxTicketFirst.shouldBe(Condition.enabled, Duration.ofSeconds(60));
        checkBoxTicketSecond.shouldBe(Condition.enabled, Duration.ofSeconds(60));
        WebActions.setCheckBox(checkBoxTicketFirst, true);
        WebActions.setCheckBox(checkBoxTicketSecond, true);
        return this;
    }

    @Step("Выбираем элемент из выпадающего списка")
    public HelpdeskAllTicketsPage selectOption (String value) {
        selectAction.selectOptionByValue(value);
        return this;
    }

    @Step("Нажимаем на кнопку Go")
    public HelpdeskAllTicketsPage clickBtnGo() {
        btnGoWST.click();
        return this;
    }

    @Step("Переходим в тикет")
    public HelpdeskAllTicketsPage clickTicketTitleName() {
        clickTicketTitle.click();
        return this;
    }

    @Step("нажимаем кнопку Reports")
    public HelpdeskAllTicketsPage clickReportsBtn() {
        reportsBtn.click();
        return this;
    }
}
