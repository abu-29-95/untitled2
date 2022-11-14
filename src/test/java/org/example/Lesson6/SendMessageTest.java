package org.example.Lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SendMessageTest extends AbstractTest {

    @Test
    void sendMessageTest (){
        new TopMenuPage(getDriver())
                .clickContact();
        new SendMessagePage(getDriver())
                .sendMessage("fortests_2022@mail.ru", "Nike","The Best");

        
        Assertions.assertFalse(getDriver().getWindowHandle().isEmpty(), "Сообщение не отправлено");
    }

}
