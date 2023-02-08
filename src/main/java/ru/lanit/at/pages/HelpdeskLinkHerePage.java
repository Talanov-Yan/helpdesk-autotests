package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.Select;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "LinkHerePage")
public class HelpdeskLinkHerePage extends WebPage {

    @Name("Кнопка Reports")
    private SelenideElement reportsBtn = $x("//span[text()=\"Reports\"]");

    @Name("SelectQuery")
    private SelenideElement selectQuery = $x("//select[@name=\"saved_query\"]");

    @Name("FilterReportBtn")
    private SelenideElement filterReportBtn = $x("//input[@value=\"Filter Report\"]");

    @Step("нажимаем на кнопу Reports")
    public HelpdeskLinkHerePage clickReportsBtn() {
        reportsBtn.click();
        return this;
    }

    @Step("Выбираем по value")
    public HelpdeskLinkHerePage selectValue( String value) {
        selectQuery.selectOptionByValue(value);
        return this;
    }

    @Step("Нажимаем на FilterReportBtn")
    public HelpdeskLinkHerePage clickFilterReportBtn() {
        filterReportBtn.click();
        return this;
    }
}
