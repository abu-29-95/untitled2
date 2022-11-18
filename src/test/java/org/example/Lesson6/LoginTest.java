package org.example.Lesson6;

import io.qameta.allure.*;
import org.example.Lesson7.ScreenshotLogsUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class LoginTest extends AbstractTest {
    @Feature("Вкладка Войти")
    @Test
    @DisplayName("Войти в систему")
    @Description("Корректный вход при валидном имени и пароля пользователя")
    @Link("http://google.com")
    @Severity(SeverityLevel.BLOCKER)
    void loginTest () throws IOException {

        new TopMenuPage(getDriver())
                .clickLogIn();

        new LogInPage(getDriver())
                .loginIn("Nike", "Test2022");

        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(new LogInPage(getDriver()).getWelcom()));

        File fileScreenshots = ScreenshotLogsUtil.makeScreenshot(getDriver(), "org.example.demoblaze.AddInCartTest"+System.currentTimeMillis()+".png");
        saveScreenshot(Files.readAllBytes(fileScreenshots.toPath()));

        Assertions.assertTrue(getDriver().findElement(By.id("nameofuser")).isDisplayed(),"Зайдите в систему");
    }

    @Step
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

}
