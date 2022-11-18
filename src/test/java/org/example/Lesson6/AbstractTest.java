package org.example.Lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Lesson7.MyWebDriverEventListener;
import org.jsoup.internal.ReturnsAreNonnullByDefault;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    static EventFiringWebDriver eventDriver;

    @BeforeAll
    static void driverConnection (){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");

        eventDriver = new EventFiringWebDriver( new ChromeDriver(options));
        eventDriver.register(new MyWebDriverEventListener());
        eventDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @BeforeEach
    void inItMainPage(){
        Assertions.assertDoesNotThrow( ()-> getDriver().navigate().to("https://www.demoblaze.com/index.html"),
                "Страница не доступна");
        Assertions.assertTrue(true);

    }

    @AfterAll
    public static void close(){
        if(eventDriver !=null) eventDriver.quit();

    }

    @AfterEach
    public void checkBrowser(){
        List<LogEntry> allLogRows = getDriver().manage().logs().get(LogType.BROWSER).getAll();

        if(!allLogRows.isEmpty()){
            if(allLogRows.size()>0){
                allLogRows.forEach(logEntry -> {
                    System.out.println(logEntry.getMessage());
                });
            }

        }
    }

    public WebDriver getDriver() {
        return this.eventDriver;
    }
}
