package org.example.Lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jsoup.internal.ReturnsAreNonnullByDefault;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AbstractTest {
    static WebDriver driver;

    @BeforeAll
    static void driverConnection (){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maxinized");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @BeforeEach
    void inItMainPage(){
        Assertions.assertDoesNotThrow( ()-> getDriver().navigate().to("https://www.demoblaze.com/index.html"),
                "Страница не доступна");
        Assertions.assertTrue(true);

    }

    @AfterAll
    static void close(){
        //driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
