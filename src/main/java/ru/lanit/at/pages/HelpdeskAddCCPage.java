package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "AddCCPage")
public class HelpdeskAddCCPage extends WebPage {

    @Name("E-MailInput")
    private SelenideElement emailInput = $x("//input[@id=\"id_email\"]");

    @Name("CheckBoxViewE_MailTrue")
    private SelenideElement checkBoxEMailView = $x("(//input[@id=\"id_can_view\"])[1]");

    @Name("CheckBoxUpdateE_MailTrue")
    private SelenideElement checkBoxEMailUpdate = $x("(//input[@id=\"id_can_update\"])[1]");

    @Name("SaveTicketCCE_MailBtn")
    private SelenideElement saveTicketCCEMailBtn = $x("(//button[text()=\"Save Ticket CC\"])[1]");

    @Name("CancelBtn")
    private SelenideElement cancelBtn = $x("//*[@id=\"EmailCC\"]/form/a");

    @Name("LinkUser")
    private SelenideElement linkUser = $x("(//a[@class=\"nav-link\"])[6]");

    @Name("SelectUser")
    private SelenideElement selectUer = $x("//select[@id=\"id_user\"]");

    @Name("CheckBoxViewUserTrue")
    private SelenideElement checkBoxUserView = $x("(//input[@id=\"id_can_view\"])[2]");

    @Name("CheckBoxUpdateUserTrue")
    private SelenideElement checkBoxUserUpdate = $x("(//input[@id=\"id_can_update\"])[2]");

    @Name("SaveTicketCCUserBtn")
    private SelenideElement saveTicketCCUserBtn = $x("(//button[@class=\"btn btn-primary\"])[3]");
}
