package org.example.Lesson6;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SendMessageTest extends AbstractTest {

    @Feature("Отправка сообщения")
    @Test
    @DisplayName("Отправить сообщение")
    @Link("http://google.com")
    @Severity(SeverityLevel.CRITICAL)
    void sendMessageTest (){
        new TopMenuPage(getDriver())
                .clickContact();
        new SendMessagePage(getDriver())
                .sendMessage("fortests_2022@mail.ru", "Nike","The Best");

        
        Assertions.assertFalse(getDriver().getWindowHandle().isEmpty(), "Сообщение не отправлено");
    }

}
