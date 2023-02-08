package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "DashboardPage")
public class HelpdeskDashboardPage extends WebPage {

    @Name("AllTickets")
    private SelenideElement allTickets = $x("//span[text()=\"All Tickets\"]//..");

    @Name("UserSettingsDropdownDash")
    private SelenideElement userSettingsDropdown = $x("//*[@id=\"bg-dark\"]/nav/ul/li[2]/div/a[1]");

    @Name("UserDropdown")
    private SelenideElement userDropdownBtn = $x("//a[@id=\"userDropdown\"]");
}
