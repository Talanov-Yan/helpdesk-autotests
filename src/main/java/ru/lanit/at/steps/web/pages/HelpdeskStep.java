package ru.lanit.at.steps.web.pages;

import ru.lanit.at.steps.web.AbstractWebSteps;
import ru.lanit.at.steps.web.WebActionWebSteps;
import ru.lanit.at.steps.web.WindowWebSteps;
import ru.lanit.at.utils.web.pagecontext.PageManager;
import java.io.IOException;

public class HelpdeskStep extends AbstractWebSteps {

    public HelpdeskStep(PageManager pageManager) {
        super(pageManager);
    }

    private final WebActionWebSteps webActionWebSteps = new WebActionWebSteps(pageManager);
    private final WindowWebSteps windowWebSteps = new WindowWebSteps(pageManager);

    public void setup() {
        try {
            System.getProperties().load(ClassLoader.getSystemResourceAsStream("helpdeskConfiguration.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String helpdeskUri = System.getProperty("site.url");
        String user = System.getProperty("user");
        String pass = System.getProperty("pass");

        windowWebSteps.open(helpdeskUri);
        windowWebSteps.setPage("HomePage");
        webActionWebSteps.clickOnElement("Кнопка Log In");
        windowWebSteps.setPage("LogInPage");
        webActionWebSteps.fillTheField("Поле логина",user);
        webActionWebSteps.fillTheField("Поле пароля",pass);
        webActionWebSteps.clickOnElement("Кнопка авторизации");
    }
}
