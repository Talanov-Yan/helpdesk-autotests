package web.testng_style;

import io.qameta.allure.Step;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.lanit.at.pages.HelpdeskAllTicketsPage;
import ru.lanit.at.pages.HelpdeskTicketPage;
import ru.lanit.at.steps.web.pages.HelpdeskStep;
import ru.lanit.at.utils.web.pagecontext.PageManager;


public class TKTwo {
    private final PageManager pageManager = new PageManager();
    private final HelpdeskStep helpdeskStep = new HelpdeskStep(pageManager);
    private final HelpdeskAllTicketsPage helpdeskAllTicketsPage = new HelpdeskAllTicketsPage();
    private final HelpdeskTicketPage helpdeskTicketPage = new HelpdeskTicketPage();

    @Test
    public void tk2() {
        step1();
        step2();
        step3();
        step4();
        step5();
        step6();
    }
    @BeforeTest
    private void before() {
        helpdeskStep.setup();
    }

    @Step("Шаг №1")
    private void step1() {
        helpdeskAllTicketsPage.setCheckBox()
                .selectOption("close")
                .clickBtnGo();
    }

    @Step("Шаг №2")
    private void step2() {
        helpdeskAllTicketsPage.setTwoCheckBox()
                .selectOption("close")
                .clickBtnGo();
    }

    @Step("Шаг №3")
    private void step3() {
        helpdeskAllTicketsPage.setCheckBox()
                .selectOption("close_public")
                .clickBtnGo();
    }

    @Step("Шаг №4")
    private void step4() {
        helpdeskAllTicketsPage.setTwoCheckBox()
                .selectOption("close_public")
                .clickBtnGo();
    }

    @Step("Шаг №5")
    private void step5() {
        helpdeskAllTicketsPage.clickTicketTitleName();
        helpdeskTicketPage.checkBoxCloseTrue()
                .clickCheckBoxUpdatePublic()
                .clickUpdateTicketBtn()
                .goToAllTickets();
    }

    @Step("Шаг №6")
    private void step6() {
        helpdeskAllTicketsPage.clickTicketTitleName();
        helpdeskTicketPage.checkBoxCloseTrue()
                .clickUpdateTicketBtn();
    }
}
