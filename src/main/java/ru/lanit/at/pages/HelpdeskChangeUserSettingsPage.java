package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "ChangeUserSettingsPage")
public class HelpdeskChangeUserSettingsPage extends WebPage {

    @Name("CheckBoxShowListOnLogin")
    private SelenideElement checkBoxShowListOnLogin = $x("//input[@id=\"id_login_view_ticketlist\"]");

    @Name("CheckBoxEmailOntTicketChange")
    private SelenideElement checkBoxEmailOnTicketChange = $x("//input[@id=\"id_email_on_ticket_change\"]");

    @Name("Кнопка Submit")
    private SelenideElement submitBtn = $x("//input[@value=\"Submit\"]");

    @Name("CheckBoxEmailAssignedTicket")
    private SelenideElement checkBoxEmailAssignedTicket = $x("//input[@id=\"id_email_on_ticket_assign\"]");

    @Name("SelectNumberTicketsToShowPerPage")
    private SelenideElement selectNumberTicketsToShowPerPage = $x("//select[@id=\"id_tickets_per_page\"]");

    @Name("CheckBoxUseEmailWhenSubmittingTickets")
    private SelenideElement checkBoxUseEmailWhenSubmittingTickets = $x("//input[@id=\"id_use_email_as_submitter\"]");
}
