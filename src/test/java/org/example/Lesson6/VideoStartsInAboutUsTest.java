package org.example.Lesson6;


import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VideoStartsInAboutUsTest extends AbstractTest {

    @Feature("Вкладка О Нас")
    @Test
    @DisplayName("Включить видео в вкладке О Нас")
    @Description("Корректное включение видео в вкладке О Нас")
    @Link("http://google.com")
    @Severity(SeverityLevel.NORMAL)
    void  videoStartsInAboutUsTest (){
        new TopMenuPage(getDriver())
                .clickAboutUs();

        new VideoStartsInAboutUsPage(getDriver())
                .videoStart();
        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@id='example-video']/video")).isEnabled(), "Видео не включается");

        new VideoStartsInAboutUsPage(getDriver())
                .pauseVideo();
       
    }
}
