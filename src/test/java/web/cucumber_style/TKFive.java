package web.cucumber_style;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.lanit.at.steps.web.DebugWebSteps;
import ru.lanit.at.steps.web.WebActionWebSteps;
import ru.lanit.at.steps.web.WebCheckWebSteps;
import ru.lanit.at.steps.web.WindowWebSteps;
import ru.lanit.at.steps.web.pages.HelpdeskStep;
import ru.lanit.at.utils.web.pagecontext.PageManager;

public class TKFive {

    private final PageManager pageManager = new PageManager();
    private final HelpdeskStep helpdeskStep = new HelpdeskStep(pageManager);
    private final DebugWebSteps debugWebSteps = new DebugWebSteps(pageManager);
    private final WindowWebSteps windowWebSteps = new WindowWebSteps(pageManager);
    private final WebActionWebSteps webActionWebSteps = new WebActionWebSteps(pageManager);
    private final WebCheckWebSteps webCheckWebSteps = new WebCheckWebSteps(pageManager);

    @Test
    public void tk5() {
        step1();
        step2();
        step3();
        step4();
        step5();
        step6();
        step7();
        step8();
        step9();
    }
    @BeforeTest
    private void before() {
        helpdeskStep.setup();
        given();
    }

    private void given() {
        windowWebSteps.setPage("AllTicketsPage");
        webActionWebSteps.clickOnElement("UserDropdown");
        webCheckWebSteps.waitUntilElementIsVisibleOnPage("UserSettingsDropdown",1);
        webActionWebSteps.clickOnElement("UserSettingsDropdown");
        windowWebSteps.setPage("ChangeUserSettingsPage");
    }

    private void step1() {
        debugWebSteps.stepNumber("1");
        webActionWebSteps.selectCheckboxOnElement("CheckBoxShowListOnLogin");
        webActionWebSteps.clickOnElement("Кнопка Submit");
        windowWebSteps.setPage("DashboardPage");
    }

    private void step2() {
        debugWebSteps.stepNumber("2");
        windowWebSteps.setPage("DashboardPage");
        webActionWebSteps.clickOnElement("UserDropdown");
        webActionWebSteps.clickOnElement("UserSettingsDropdownDash");
        windowWebSteps.setPage("ChangeUserSettingsPage");
        webActionWebSteps.unselectCheckboxOnElement("CheckBoxEmailOntTicketChange");
        webActionWebSteps.clickOnElement("Кнопка Submit");
        windowWebSteps.setPage("DashboardPage");
    }

    private void step3() {
        debugWebSteps.stepNumber("3");
        webActionWebSteps.clickOnElement("UserDropdown");
        webActionWebSteps.clickOnElement("UserSettingsDropdownDash");
        windowWebSteps.setPage("ChangeUserSettingsPage");
        webActionWebSteps.selectCheckboxOnElement("CheckBoxEmailOntTicketChange");
        webActionWebSteps.clickOnElement("Кнопка Submit");
        windowWebSteps.setPage("DashboardPage");
    }

    private void step4() {
        debugWebSteps.stepNumber("4");
        webActionWebSteps.clickOnElement("UserDropdown");
        webActionWebSteps.clickOnElement("UserSettingsDropdownDash");
        windowWebSteps.setPage("ChangeUserSettingsPage");
        webActionWebSteps.unselectCheckboxOnElement("CheckBoxEmailOntTicketChange");
        webActionWebSteps.clickOnElement("Кнопка Submit");
        windowWebSteps.setPage("DashboardPage");
    }

    private void step5() {
        debugWebSteps.stepNumber("5");
        webActionWebSteps.clickOnElement("UserDropdown");
        webActionWebSteps.clickOnElement("UserSettingsDropdownDash");
        windowWebSteps.setPage("ChangeUserSettingsPage");
        webActionWebSteps.selectCheckboxOnElement("CheckBoxEmailAssignedTicket");
        webActionWebSteps.clickOnElement("Кнопка Submit");
        windowWebSteps.setPage("DashboardPage");
    }

    private void step6() {
        debugWebSteps.stepNumber("6");
        webActionWebSteps.clickOnElement("UserDropdown");
        webActionWebSteps.clickOnElement("UserSettingsDropdownDash");
        windowWebSteps.setPage("ChangeUserSettingsPage");
        webActionWebSteps.unselectCheckboxOnElement("CheckBoxEmailAssignedTicket");
        webActionWebSteps.clickOnElement("Кнопка Submit");
        windowWebSteps.setPage("DashboardPage");
    }

    private void step7() {
        debugWebSteps.stepNumber("7");
        webActionWebSteps.clickOnElement("UserDropdown");
        webActionWebSteps.clickOnElement("UserSettingsDropdownDash");
        windowWebSteps.setPage("ChangeUserSettingsPage");
        webActionWebSteps.useSelectByValue("SelectNumberTicketsToShowPerPage","10");
        webActionWebSteps.clickOnElement("Кнопка Submit");
        windowWebSteps.setPage("DashboardPage");
    }

    private void step8() {
        debugWebSteps.stepNumber("8");
        webActionWebSteps.clickOnElement("UserDropdown");
        webActionWebSteps.clickOnElement("UserSettingsDropdownDash");
        windowWebSteps.setPage("ChangeUserSettingsPage");
        webActionWebSteps.selectCheckboxOnElement("CheckBoxUseEmailWhenSubmittingTickets");
        webActionWebSteps.clickOnElement("Кнопка Submit");
        windowWebSteps.setPage("DashboardPage");
    }

    private void step9() {
        debugWebSteps.stepNumber("9");
        webActionWebSteps.clickOnElement("UserDropdown");
        webActionWebSteps.clickOnElement("UserSettingsDropdownDash");
        windowWebSteps.setPage("ChangeUserSettingsPage");
        webActionWebSteps.unselectCheckboxOnElement("CheckBoxUseEmailWhenSubmittingTickets");
        webActionWebSteps.clickOnElement("Кнопка Submit");
        windowWebSteps.setPage("DashboardPage");
    }
}
