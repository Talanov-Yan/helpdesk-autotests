package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "ReportsStatisticsPage")
public class HelpdeskReportsStatisticsPage extends WebPage {

    @Name("LinkHere")
    private SelenideElement linkHere = $x("//a[text()=\"here\"]");

    @Name("UserByPriorityLink")
    private SelenideElement userByPriorityLink = $x("(//a[text()=\"by Priority\"])[1]");

    @Name("UserByQueueLink")
    private SelenideElement userByQueueLink = $x("//a[text()=\"by Queue\"]");

    @Name("UserByStatusLink")
    private SelenideElement userByStatusLink = $x("(//a[text()=\"by Status\"])[1]");

    @Name("UserByMonthLink")
    private SelenideElement userByMonthLink = $x("(//a[text()=\"by Month\"])[1]");

    @Name("QueueByPriorityLink")
    private SelenideElement queueByPriorityLink = $x("(//a[text()=\"by Priority\"])[2]");

    @Name("QueueByStatusLink")
    private SelenideElement queueByStatusLink = $x("(//a[text()=\"by Status\"])[2]");

    @Name("QueueByMonthLink")
    private SelenideElement queueByMonthLink = $x("(//a[text()=\"by Month\"])[2]");

    @Name("QueueClosedByMonth")
    private SelenideElement queueClosedByMonthLink = $x("//a[text()=\"Days until ticket closed by Month\"]");

    @Step("Нажимаем на closed by Month у Queue")
    public HelpdeskReportsStatisticsPage clickClosedByMonthLink() {
        queueClosedByMonthLink.click();
        return this;
    }

    @Step("Нажимаем на by Month у Queue")
    public HelpdeskReportsStatisticsPage clickByMonthQueue() {
        queueByMonthLink.click();
        return this;
    }

    @Step("Нажимаем на by Status у Queue")
    public HelpdeskReportsStatisticsPage clickByStatusQueue() {
        queueByStatusLink.click();
        return this;
    }

    @Step("Нажимаем на by Priority у Queue")
    public HelpdeskReportsStatisticsPage clickByPriorityQueue() {
        queueByPriorityLink.click();
        return this;
    }

    @Step("Нажимаем на by Month у User")
    public HelpdeskReportsStatisticsPage clickByMonthUser() {
        userByMonthLink.click();
        return this;
    }

    @Step("Нажимаем на by Status у User")
    public HelpdeskReportsStatisticsPage clickByStatusUser() {
        userByStatusLink.click();
        return this;
    }

    @Step("Нажимаем на by Queue у User")
    public HelpdeskReportsStatisticsPage clickByQueueUser() {
        userByQueueLink.click();
        return this;
    }

    @Step("Нажимаем на by Priority у User")
    public HelpdeskReportsStatisticsPage clickByPriorityUser() {
        userByPriorityLink.click();
        return this;
    }

    @Step("Переходим по ссылке here")
    public HelpdeskReportsStatisticsPage clickLinkHere() {
        linkHere.click();
        return this;
    }
}
