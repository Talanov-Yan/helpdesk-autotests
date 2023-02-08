package web.cucumber_style;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.lanit.at.steps.web.DebugWebSteps;
import ru.lanit.at.steps.web.WebActionWebSteps;
import ru.lanit.at.steps.web.WindowWebSteps;
import ru.lanit.at.steps.web.pages.HelpdeskStep;
import ru.lanit.at.utils.web.pagecontext.PageManager;

public class TKFour {

    private final PageManager pageManager = new PageManager();
    private final HelpdeskStep helpdeskStep = new HelpdeskStep(pageManager);
    private final DebugWebSteps debugWebSteps = new DebugWebSteps(pageManager);
    private final WindowWebSteps windowWebSteps = new WindowWebSteps(pageManager);
    private final WebActionWebSteps webActionWebSteps = new WebActionWebSteps(pageManager);

    @Test
    public void tk4() {
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
        webActionWebSteps.clickOnElement("TicketTitleInTable");
        windowWebSteps.setPage("TicketPage");
    }

    private void step1() {
        debugWebSteps.stepNumber("1");
        webActionWebSteps.clickOnElement("Кнопка пиктограммы стрелки");
        windowWebSteps.setPage("CCSettingsPage");
        webActionWebSteps.clickOnElement("Кнопка AddEmailOrHelpdeskUser");
        windowWebSteps.setPage("AddCCPage");
        webActionWebSteps.fillTheField("E-MailInput","qq2qq@bk.ru");
        webActionWebSteps.selectCheckboxOnElement("CheckBoxViewE_MailTrue");
        webActionWebSteps.selectCheckboxOnElement("CheckBoxUpdateE_MailTrue");
    }

    private void step2() {
        debugWebSteps.stepNumber("2");
        webActionWebSteps.clickOnElement("SaveTicketCCE_MailBtn");
        windowWebSteps.setPage("CCSettingsPage");
        webActionWebSteps.clickOnElement("Ссылка good_website");
        windowWebSteps.setPage("TicketPage");
    }

    private void step3() {
        debugWebSteps.stepNumber("3");
        webActionWebSteps.clickOnElement("Кнопка пиктограммы стрелки");
        windowWebSteps.setPage("CCSettingsPage");
        webActionWebSteps.clickOnElement("Кнопка AddEmailOrHelpdeskUser");
        windowWebSteps.setPage("AddCCPage");
        webActionWebSteps.fillTheField("E-MailInput","q2@bk.ru");
        webActionWebSteps.selectCheckboxOnElement("CheckBoxViewE_MailTrue");
        webActionWebSteps.selectCheckboxOnElement("CheckBoxUpdateE_MailTrue");
        webActionWebSteps.clickOnElement("CancelBtn");
        windowWebSteps.setPage("CCSettingsPage");
    }

    private void step4() {
        debugWebSteps.stepNumber("4");
        webActionWebSteps.clickOnElement("Кнопка AddEmailOrHelpdeskUser");
        windowWebSteps.setPage("AddCCPage");
        webActionWebSteps.clickOnElement("LinkUser");
        webActionWebSteps.useSelectByValue("SelectUser","1");
    }

    private void step5() {
        debugWebSteps.stepNumber("5");
        webActionWebSteps.clickOnElement("SaveTicketCCUserBtn");
        windowWebSteps.setPage("CCSettingsPage");
        webActionWebSteps.clickOnElement("Кнопка Return To");
    }

    private void step6() {
        debugWebSteps.stepNumber("6");
        windowWebSteps.setPage("TicketPage");
        webActionWebSteps.clickOnElement("Кнопка пиктограммы стрелки");
        windowWebSteps.setPage("CCSettingsPage");
        webActionWebSteps.clickOnElement("Кнопка Delete");
        windowWebSteps.setPage("DeleteCCPage");
    }

    private void step7() {
        debugWebSteps.stepNumber("7");
        webActionWebSteps.clickOnElement("Кнопка Don't Delete");
        windowWebSteps.setPage("CCSettingsPage");
        webActionWebSteps.clickOnElement("Кнопка Return To");
        windowWebSteps.setPage("TicketPage");
    }

    private void step8() {
        debugWebSteps.stepNumber("8");
        webActionWebSteps.clickOnElement("Кнопка пиктограммы стрелки");
        windowWebSteps.setPage("CCSettingsPage");
        webActionWebSteps.clickOnElement("Кнопка Delete");
        windowWebSteps.setPage("DeleteCCPage");
        webActionWebSteps.clickOnElement("Кнопка yesDelete");
        windowWebSteps.setPage("CCSettingsPage");
        webActionWebSteps.clickOnElement("Кнопка Return To");
        windowWebSteps.setPage("TicketPage");
    }

    private void step9() {
        debugWebSteps.stepNumber("9");
        webActionWebSteps.clickOnElement("AllTickets");
        windowWebSteps.setPage("AllTicketsPage");
        webActionWebSteps.clickOnElement("TicketTitleInTableTwo");
        windowWebSteps.setPage("TicketPage");
        webActionWebSteps.clickOnElement("Кнопка Subscribe");
    }
}
