package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maxinized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        //Login Test
        driver.get("http://automationpractice.com");
        WebElement webElement1 = driver.findElement(By.xpath(".//a[@title='Log in to your customer account']"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.id("email"));
        webElement2.click();
        webElement2.sendKeys("fortests_2022@mail.ru");

        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id='passwd']"));
        webElement3.click();
        webElement3.sendKeys("Test2022");

        WebElement webElement4 = driver.findElement(By.id("SubmitLogin"));
        webElement4.click();


        //Add a new address test
        driver.get("http://automationpractice.com/index.php?controller=my-account");
        WebElement webElement5 = driver.findElement(By.xpath(".//a[@title='Add my first address']"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.id("address1"));
        webElement6.click();
        webElement6.sendKeys("Orbita street, 100001");

        WebElement webElement7 = driver.findElement(By.id("address2"));
        webElement7.click();
        webElement7.sendKeys("34,19");

        WebElement webElement8 = driver.findElement(By.id("city"));
        webElement8.click();
        webElement8.sendKeys("Karaganda");

        WebElement webElement9 = driver.findElement(By.id("id_state"));
        webElement9.click();

        WebElement webElement10 = driver.findElement(By.xpath(".//*[@id='id_state']/*[@value='32']"));
        webElement10.click();

        WebElement webElement11 = driver.findElement(By.id("postcode"));
        webElement11.click();
        webElement11.sendKeys("00000");

        WebElement webElement12 = driver.findElement(By.id("phone_mobile"));
        webElement12.click();
        webElement12.sendKeys("+8005004466");

        WebElement webElement13 = driver.findElement(By.id("alias"));
        webElement13.click();

        WebElement webElement14 = driver.findElement(By.id("submitAddress"));
        webElement14.click();


        // Add in cart test
        driver.get("http://automationpractice.com/index.php");

        WebElement webElement15 = driver.findElement(By.id("search_query_top"));
        webElement15.click();
        webElement15.sendKeys("Dress");

        WebElement webElement16 = driver.findElement(By.xpath(".//form[@id='searchbox']/button"));
        webElement16.click();

        WebElement webElement17 = driver.findElement(By.id("list"));
        webElement17.click();

        WebElement webElement18 = driver.findElement(By.xpath(".//a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=5&token=014ebb30b6bf6f56fe9100b28d926072']"));
        webElement18.click();


        // Block top menu Women test
        driver.get("http://automationpractice.com/index.php");

        Actions actions = new Actions(driver);

        WebElement webElement19 = driver.findElement(By.xpath(".//a[@title='Women']"));
        actions.moveToElement(webElement19).perform();

        WebElement webElement20 = driver.findElement(By.xpath(".//ul[@class='submenu-container clearfix first-in-line-xs']//a[@title='T-shirts']"));
        //new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(webElement20));
        webElement20.click();

        WebElement webElement21 = driver.findElement(By.xpath(".//a[@title='Women']"));
        actions.moveToElement(webElement21).perform();
        WebElement webElement22 = driver.findElement(By.xpath(".//a[@title='Blouses']"));
        webElement22.click();

        WebElement webElement23 = driver.findElement(By.xpath(".//a[@title='Women']"));
        actions.moveToElement(webElement23).perform();
        WebElement webElement24 = driver.findElement(By.xpath(".//a[@title='Casual Dresses']"));
        webElement24.click();

        WebElement webElement25 = driver.findElement(By.xpath(".//a[@title='Women']"));
        actions.moveToElement(webElement25).perform();
        WebElement webElement26 = driver.findElement(By.xpath(".//a[@title='Evening Dresses']"));
        webElement26.click();

        WebElement webElement27 = driver.findElement(By.xpath(".//a[@title='Women']"));
        actions.moveToElement(webElement27).perform();
        WebElement webElement28 = driver.findElement(By.xpath(".//a[@title='Summer Dresses']"));
        webElement28.click();

        // driver.quit();
    }
}
