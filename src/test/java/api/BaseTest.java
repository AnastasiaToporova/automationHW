package api;

import config.WebDriverConfiguration;
import constants.CodeExampleConst;
import enumeration.SupportedDrivers;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import utils.PageStorage;


@RunWith(JUnit4.class)
public class BaseTest {
    protected PageStorage storage;
    protected WebDriver driver;
    protected CodeExampleConst consts;

    @Before
    public void initDriver() {
        driver = WebDriverConfiguration.setWebDriver(SupportedDrivers.CHROME);
        storage = new PageStorage();
        consts = new CodeExampleConst();
    }

    @After
    public void tearDown() {
        WebDriverConfiguration.clearCookies();
        WebDriverConfiguration.tearDown();
    }

}