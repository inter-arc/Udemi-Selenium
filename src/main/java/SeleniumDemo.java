import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class SeleniumDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        findLoginPageElements(driver);
        driver.quit();
    }

    private static void findExceptionPageElements(WebDriver driver) {
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");
        // Find WebElement for the "Selenium WebDriver with Java for beginners program" link using link text and partial link text
        WebElement linkTextLocator = driver.findElement(By.linkText("Selenium WebDriver with Java for beginners program"));
        WebElement linkPartialTextLocator = driver.findElement(By.partialLinkText("Selenium WebDriver with "));
        // Find WebElements for the input field using tag, class name, XPath, and CSS
        WebElement inputFieldLocatorTag = driver.findElement(By.tagName("input"));
        WebElement inputFieldLocatorClass = driver.findElement(By.className("input-field"));
        WebElement inputFieldLocatorXPath = driver.findElement(By.xpath("//*[@id=\"row1\"]/input"));
        WebElement inputFieldLocatorCss = driver.findElement(By.cssSelector("#row1 > input"));
        // Create a list of WebElements for all buttons using tag
        List<WebElement> buttonsLocatorTag = driver.findElements(By.tagName("button"));
        // Identify both buttons, using ID, name, CSS, XPath for each
        WebElement buttonsLocatorClass = driver.findElement(By.name("Edit"));
        WebElement buttonsLocatorId = driver.findElement(By.id("edit_btn"));
        WebElement buttonsLocatorCss = driver.findElement(By.cssSelector("#edit_btn"));
        WebElement buttonsLocatorXpath = driver.findElement(By.xpath("//*[@id=\"edit_btn\"]"));
    }

    private static void findLoginPageElements(WebDriver driver) {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        // WebElement locators will be added here
        WebElement usernameInputField = driver.findElement(By.id("username"));
        usernameInputField.sendKeys("username");
        //WebElement usernameInputFieldXpath = driver.findElement(By.xpath("//input[@id='username']"));
        //WebElement usernameInputFieldCss = driver.findElement(By.cssSelector("input[id='username']"));

        WebElement passwordInputField = driver.findElement(By.name("password"));
        passwordInputField.sendKeys("password");
        //WebElement passwordInputFieldXpath = driver.findElement(By.xpath("//input[@name='password']"));
        //WebElement passwordInputFieldCss = driver.findElement(By.cssSelector("input[name='password']"));

        WebElement submitButton = driver.findElement(By.className("btn"));
        submitButton.isDisplayed();
        submitButton.click();
        //WebElement submitButtonXpath = driver.findElement(By.xpath("//button[@id='submit']"));
        //WebElement submitButtonCss = driver.findElement(By.cssSelector("button[id=submit]"));

        /*
        List<WebElement> inputFields = driver.findElements(By.tagName("input"));

        WebElement linkTextLocator = driver.findElement(By.linkText("Practice Test Automation."));
        WebElement partialLinkTextLocator = driver.findElement(By.partialLinkText("Test Automation"));

        WebElement passwordFieldBelowUsername = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
        WebElement privacyPolicyLink = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.partialLinkText("Test Automation")));

        WebElement homeButton = driver.findElement(By.className("menu-item-home"));
        */
    }

    private static String chromeTest(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }

    private static String firefoxTest(String url) {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }
}