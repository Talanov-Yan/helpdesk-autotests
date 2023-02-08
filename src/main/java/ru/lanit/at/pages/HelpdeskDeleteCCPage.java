package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "DeleteCCPage")
public class HelpdeskDeleteCCPage extends WebPage {

    @Name("Кнопка Don't Delete")
    private SelenideElement dontDeleteBtn = $x("//button[text()=\"Don't Delete\"]");

    @Name("Кнопка yesDelete")
    private SelenideElement yesDelete = $x("//button[text()=\"Yes I Understand - Delete\"]");
}
