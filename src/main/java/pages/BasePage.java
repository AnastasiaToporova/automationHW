package pages;

import config.WaitConfiguration;
import config.WebDriverConfiguration;
import exeptions.ValidationExceptions;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    public BasePage() {
        WaitConfiguration waitConfiguration = new WaitConfiguration.Builder()
                .setDefaultImplicitTimeUnit(TimeUnit.SECONDS)
                .setDefaultImplicitTimeout(2)
                .setDefaultExplicitTimeout(2)
                .build();

        WaitUtils.setWaitConfiguration(waitConfiguration);
    }

    public BasePage open() {
        getWebDriver().get(getUrl());
        return this;
    }

    public WebDriver getWebDriver() {
        return WebDriverConfiguration.getWebDriver();
    }

    public void isPageOpen() throws ValidationExceptions.WrongPageOpenedException {
        if (!getWebDriver().getCurrentUrl().equals(getUrl())) {
            throw new ValidationExceptions
                    .WrongPageOpenedException(MessageFormat
                    .format("Wrong page URL! Expected : {0} Actual : {1}",getUrl(),getWebDriver().getCurrentUrl()));
        }
    }

    public abstract String getUrl();
}
