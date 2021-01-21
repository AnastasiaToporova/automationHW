package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.LinkedList;
import java.util.List;

public class DocumentationPage extends BasePage {
    public DocumentationPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @Override
    public String getUrl() {
        return "https://www.selenium.dev/documentation/en/";
    }

    @FindBy(xpath = "//input[contains(@id,'code2')]/following-sibling::label")
    private List<WebElement> radioButtonsOfLanguageList;

    @FindBy(xpath = "//code[contains(@class,'language')]")
    private List<WebElement> codeSectionExampleList;


    public DocumentationPage open() {
        getWebDriver().get(getUrl());
        return this;
    }

    public List<String> checkCode() {
        List<String> codeExampleList = new LinkedList<>();

        for (int i = 0; i < radioButtonsOfLanguageList.size(); i++) {
            radioButtonsOfLanguageList.get(i).click();
            codeExampleList.add(codeSectionExampleList.get(i).getText());
        }
        return codeExampleList;
    }
}
