package constants;

import java.util.ArrayList;
import java.util.List;

public final class CodeExampleConst {
    private final String CODE_EXAMPLE_OF_JAVA = "import org.openqa.selenium.By;\n" +
            "import org.openqa.selenium.Keys;\n" +
            "import org.openqa.selenium.WebDriver;\n" +
            "import org.openqa.selenium.WebElement;\n" +
            "import org.openqa.selenium.firefox.FirefoxDriver;\n" +
            "import org.openqa.selenium.support.ui.WebDriverWait;\n" +
            "import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;\n" +
            "import java.time.Duration;\n" +
            "\n" +
            "public class HelloSelenium {\n" +
            "\n" +
            "    public static void main(String[] args) {\n" +
            "        WebDriver driver = new FirefoxDriver();\n" +
            "        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));\n" +
            "        try {\n" +
            "            driver.get(\"https://google.com/ncr\");\n" +
            "            driver.findElement(By.name(\"q\")).sendKeys(\"cheese\" + Keys.ENTER);\n" +
            "            WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector(\"h3>div\")));\n" +
            "            System.out.println(firstResult.getAttribute(\"textContent\"));\n" +
            "        } finally {\n" +
            "            driver.quit();\n" +
            "        }\n" +
            "    }\n" +
            "}\n" +
            "  ";

    private final String CODE_EXAMPLE_OF_PYTHON = "from selenium import webdriver\n" +
            "from selenium.webdriver.common.by import By\n" +
            "from selenium.webdriver.common.keys import Keys\n" +
            "from selenium.webdriver.support.ui import WebDriverWait\n" +
            "from selenium.webdriver.support.expected_conditions import presence_of_element_located\n" +
            "\n" +
            "#This example requires Selenium WebDriver 3.13 or newer\n" +
            "with webdriver.Firefox() as driver:\n" +
            "    wait = WebDriverWait(driver, 10)\n" +
            "    driver.get(\"https://google.com/ncr\")\n" +
            "    driver.find_element(By.NAME, \"q\").send_keys(\"cheese\" + Keys.RETURN)\n" +
            "    first_result = wait.until(presence_of_element_located((By.CSS_SELECTOR, \"h3>div\")))\n" +
            "    print(first_result.get_attribute(\"textContent\"))\n" +
            "  ";
    private final String CODE_EXAMPLE_OF_C = "using System;\n" +
            "using OpenQA.Selenium;\n" +
            "using OpenQA.Selenium.Firefox;\n" +
            "using OpenQA.Selenium.Support.UI;\n" +
            "\n" +
            "class HelloSelenium {\n" +
            "  static void Main() {\n" +
            "    using(IWebDriver driver = new FirefoxDriver()) {\n" +
            "      WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));\n" +
            "      driver.Navigate().GoToUrl(\"https://www.google.com/ncr\");\n" +
            "      driver.FindElement(By.Name(\"q\")).SendKeys(\"cheese\" + Keys.Enter);\n" +
            "      wait.Until(webDriver => webDriver.FindElement(By.CssSelector(\"h3>div\")).Displayed);\n" +
            "      IWebElement firstResult = driver.FindElement(By.CssSelector(\"h3>div\"));\n" +
            "      Console.WriteLine(firstResult.GetAttribute(\"textContent\"));\n" +
            "    }\n" +
            "  }\n" +
            "}\n" +
            "  ";
    private final String CODE_EXAMPLE_OF_RUBY = "require 'selenium-webdriver'\n" +
            "\n" +
            "driver = Selenium::WebDriver.for :firefox\n" +
            "wait = Selenium::WebDriver::Wait.new(timeout: 10)\n" +
            "\n" +
            "begin\n" +
            "  driver.get 'https://google.com/ncr'\n" +
            "  driver.find_element(name: 'q').send_keys 'cheese', :return\n" +
            "  first_result = wait.until { driver.find_element(css: 'h3>div') }\n" +
            "  puts first_result.attribute('textContent')\n" +
            "ensure\n" +
            "  driver.quit\n" +
            "end\n" +
            "  ";
    private final String CODE_EXAMPLE_OF_JS = "const {Builder, By, Key, until} = require('selenium-webdriver');\n" +
            "\n" +
            "(async function example() {\n" +
            "    let driver = await new Builder().forBrowser('firefox').build();\n" +
            "    try {\n" +
            "        // Navigate to Url\n" +
            "        await driver.get('https://www.google.com');\n" +
            "\n" +
            "        // Enter text \"cheese\" and perform keyboard action \"Enter\"\n" +
            "        await driver.findElement(By.name('q')).sendKeys('cheese', Key.ENTER);\n" +
            "\n" +
            "        let firstResult = await driver.wait(until.elementLocated(By.css('h3>div')), 10000);\n" +
            "\n" +
            "        console.log(await firstResult.getAttribute('textContent'));\n" +
            "    }\n" +
            "    finally{\n" +
            "        driver.quit();\n" +
            "    }\n" +
            "})();\n" +
            "  ";
    private final String CODE_EXAMPLE_OF_KOTLIN = "import org.openqa.selenium.By\n" +
            "import org.openqa.selenium.Keys\n" +
            "import org.openqa.selenium.firefox.FirefoxDriver\n" +
            "import org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated\n" +
            "import org.openqa.selenium.support.ui.WebDriverWait\n" +
            "import java.time.Duration\n" +
            "\n" +
            "fun main() {\n" +
            "    val driver = FirefoxDriver()\n" +
            "    val wait = WebDriverWait(driver, Duration.ofSeconds(10))\n" +
            "    try {\n" +
            "        driver.get(\"https://google.com/ncr\")\n" +
            "        driver.findElement(By.name(\"q\")).sendKeys(\"cheese\" + Keys.ENTER)\n" +
            "        val firstResult = wait.until(presenceOfElementLocated(By.cssSelector(\"h3>div\")))\n" +
            "        println(firstResult.getAttribute(\"textContent\"))\n" +
            "    } finally {\n" +
            "        driver.quit()\n" +
            "    }\n" +
            "}\n" +
            "  ";
private final List<String> CODE_EXAMPLE_LIST ;


    public CodeExampleConst() {
        CODE_EXAMPLE_LIST = new ArrayList<>();
        CODE_EXAMPLE_LIST.add(CODE_EXAMPLE_OF_JAVA);
        CODE_EXAMPLE_LIST.add(CODE_EXAMPLE_OF_PYTHON);
        CODE_EXAMPLE_LIST.add(CODE_EXAMPLE_OF_C);
        CODE_EXAMPLE_LIST.add(CODE_EXAMPLE_OF_RUBY);
        CODE_EXAMPLE_LIST.add(CODE_EXAMPLE_OF_JS);
        CODE_EXAMPLE_LIST.add(CODE_EXAMPLE_OF_KOTLIN);
    }
    public List<String> getCODE_EXAMPLE_LIST(){
        return CODE_EXAMPLE_LIST;
    }
}
