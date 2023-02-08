package web.testng_style;

import io.qameta.allure.Step;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.lanit.at.pages.*;
import ru.lanit.at.steps.web.pages.HelpdeskStep;
import ru.lanit.at.utils.web.pagecontext.PageManager;

public class TKThree {
    private final PageManager pageManager = new PageManager();
    private final HelpdeskStep helpdeskStep = new HelpdeskStep(pageManager);
    private final HelpdeskAllTicketsPage helpdeskAllTicketsPage = new HelpdeskAllTicketsPage();
    private final HelpdeskReportsStatisticsPage helpdeskReportsStatisticsPage = new HelpdeskReportsStatisticsPage();
    private final HelpdeskLinkHerePage helpdeskLinkHerePage = new HelpdeskLinkHerePage();

    @Test
    public void tk3() {
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
        helpdeskAllTicketsPage.clickReportsBtn();
    }
    @Step("Шаг №1")
    private void step1() {
        helpdeskReportsStatisticsPage.clickLinkHere();
        helpdeskLinkHerePage.selectValue("2")
                .clickFilterReportBtn();

    }

    @Step("Шаг №2")
    private void step2() {
        helpdeskLinkHerePage.clickReportsBtn();
        helpdeskReportsStatisticsPage.clickByPriorityUser();
        helpdeskLinkHerePage.selectValue("2")
                .clickFilterReportBtn();
    }

    @Step("Шаг №3")
    private void step3() {
        helpdeskLinkHerePage.clickReportsBtn();
        helpdeskReportsStatisticsPage.clickByQueueUser();
        helpdeskLinkHerePage.selectValue("2")
                .clickFilterReportBtn();
    }

    @Step("Шаг №4")
    private void step4() {
        helpdeskLinkHerePage.clickReportsBtn();
        helpdeskReportsStatisticsPage.clickByStatusUser();
        helpdeskLinkHerePage.selectValue("2")
                .clickFilterReportBtn();
    }

    @Step("Шаг №5")
    private void step5() {
        helpdeskLinkHerePage.clickReportsBtn();
        helpdeskReportsStatisticsPage.clickByMonthUser();
        helpdeskLinkHerePage.selectValue("2")
                .clickFilterReportBtn();
    }

    @Step("Шаг №6")
    private void step6() {
        helpdeskLinkHerePage.clickReportsBtn();
        helpdeskReportsStatisticsPage.clickByPriorityQueue();
        helpdeskLinkHerePage.selectValue("2")
                .clickFilterReportBtn();
    }

    @Step("Шаг №7")
    private void step7() {
        helpdeskLinkHerePage.clickReportsBtn();
        helpdeskReportsStatisticsPage.clickByStatusQueue();
        helpdeskLinkHerePage.selectValue("2").clickFilterReportBtn();
    }

    @Step("Шаг №8")
    private void step8() {
        helpdeskLinkHerePage.clickReportsBtn();
        helpdeskReportsStatisticsPage.clickByMonthQueue();
        helpdeskLinkHerePage.selectValue("2").clickFilterReportBtn();
    }

    @Step("Шаг №9")
    private void step9() {
        helpdeskLinkHerePage.clickReportsBtn();
        helpdeskReportsStatisticsPage.clickClosedByMonthLink();
        helpdeskLinkHerePage.selectValue("2").clickFilterReportBtn();
    }
}
