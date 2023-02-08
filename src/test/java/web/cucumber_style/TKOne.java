package web.cucumber_style;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.lanit.at.steps.web.DebugWebSteps;
import ru.lanit.at.steps.web.WebActionWebSteps;
import ru.lanit.at.steps.web.WindowWebSteps;
import ru.lanit.at.steps.web.pages.HelpdeskStep;
import ru.lanit.at.utils.web.pagecontext.PageManager;

public class TKOne {

    private final PageManager pageManager = new PageManager();
    private final DebugWebSteps debugWebSteps = new DebugWebSteps(pageManager);
    private final WindowWebSteps windowWebSteps = new WindowWebSteps(pageManager);
    private final WebActionWebSteps webActionWebSteps = new WebActionWebSteps(pageManager);
    private final HelpdeskStep helpdeskStep = new HelpdeskStep(pageManager);

    @Test
    public void tk1() {
        step1();
        step2();
        step3();
        step4();
    }
    @BeforeTest
    private void before() {
        helpdeskStep.setup();
        given();
    }

    private void given() {
        windowWebSteps.setPage("AllTicketsPage");
        webActionWebSteps.fillTheField("Поле поиска", "Some");
        webActionWebSteps.clickOnElement("Кнопка Go");
        webActionWebSteps.clickOnElement("Column visibility");
        webActionWebSteps.clickToToggle("Select",false);
        webActionWebSteps.clickToToggle("Ticket",false);
        webActionWebSteps.clickToToggle("Priority",false);
        webActionWebSteps.clickToToggle("Queue",false);
        webActionWebSteps.clickToToggle("Status",false);
        webActionWebSteps.clickToToggle("Created",false);
        webActionWebSteps.clickToToggle("DueDate",false);
        webActionWebSteps.clickToToggle("Owner",false);
        webActionWebSteps.clickToToggle("Submitter",false);
        webActionWebSteps.clickToToggle("TimeSpent",false);
        webActionWebSteps.clickToToggle("KBItem",false);
        webActionWebSteps.clickOnElement("btnBackground");
    }

    private void step1() {
        debugWebSteps.stepNumber("1");
        webActionWebSteps.clickOnElement("TableTicket");
        webActionWebSteps.clickOnElement("TablePriority");
        webActionWebSteps.clickOnElement("TableQueue");
        webActionWebSteps.clickOnElement("TableStatus");
        webActionWebSteps.clickOnElement("TableCreated");
        webActionWebSteps.clickOnElement("TableDueDate");
        webActionWebSteps.clickOnElement("TableOwner");
        webActionWebSteps.clickOnElement("TableSubmitter");
        webActionWebSteps.clickOnElement("TableTimeSpent");
        webActionWebSteps.clickOnElement("TableKBItem");
    }

    private void step2() {
        debugWebSteps.stepNumber("2");
        webActionWebSteps.clickOnElement("TableTicket");
        webActionWebSteps.clickOnElement("TableTicket");
        webActionWebSteps.clickOnElement("TablePriority");
        webActionWebSteps.clickOnElement("TablePriority");
        webActionWebSteps.clickOnElement("TableQueue");
        webActionWebSteps.clickOnElement("TableQueue");
        webActionWebSteps.clickOnElement("TableStatus");
        webActionWebSteps.clickOnElement("TableStatus");
        webActionWebSteps.clickOnElement("TableCreated");
        webActionWebSteps.clickOnElement("TableCreated");
        webActionWebSteps.clickOnElement("TableDueDate");
        webActionWebSteps.clickOnElement("TableDueDate");
        webActionWebSteps.clickOnElement("TableOwner");
        webActionWebSteps.clickOnElement("TableOwner");
        webActionWebSteps.clickOnElement("TableSubmitter");
        webActionWebSteps.clickOnElement("TableSubmitter");
        webActionWebSteps.clickOnElement("TableTimeSpent");
        webActionWebSteps.clickOnElement("TableTimeSpent");
        webActionWebSteps.clickOnElement("TableKBItem");
        webActionWebSteps.clickOnElement("TableKBItem");
    }

    private void step3() {
        debugWebSteps.stepNumber("3");
        webActionWebSteps.clickOnElement("TimeLine");
        webActionWebSteps.clickOnElement("More");
        webActionWebSteps.clickOnElement("Less");
        webActionWebSteps.clickOnElement("Table");
        webActionWebSteps.clickOnElement("TicketTitle");
        windowWebSteps.setPage("TicketPage");
    }

    private void step4() {
        debugWebSteps.stepNumber("4");
        webActionWebSteps.clickOnElement("AllTickets");
        windowWebSteps.setPage("AllTicketsPage");
        webActionWebSteps.useSelectByValue("ShowEntries","10");
        webActionWebSteps.clickOnElement("PageLink2");
        webActionWebSteps.clickOnElement("PageNext");
    }
}
