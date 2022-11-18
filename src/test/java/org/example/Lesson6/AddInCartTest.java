package org.example.Lesson6;


import io.qameta.allure.*;
import org.example.Lesson7.ScreenshotLogsUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Story("Я как пользователь хочу добавить товар в корзину чтобы разместить заказ")
public class AddInCartTest extends AbstractTest {
    @Test
    @DisplayName("Добавить в корзину")
    @Description("Тест добавляет товар в корзину")
    @Link("http://google.com")
    @Severity(SeverityLevel.BLOCKER)
    void addInCartTest () throws IOException {

       new AddInCartPage (getDriver())
               .addInCart();

       File fileScreenshots = ScreenshotLogsUtil.makeScreenshot(getDriver(), "org.example.demoblaze.AddInCartTest"+System.currentTimeMillis()+".png");
       saveScreenshot(Files.readAllBytes(fileScreenshots.toPath()));

        Assertions.assertFalse(getDriver().getWindowHandle().isEmpty(), "Не добавлено в корзину");
    }


    @Step
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }


}
