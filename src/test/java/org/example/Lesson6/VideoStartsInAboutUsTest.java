package org.example.Lesson6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VideoStartsInAboutUsTest extends AbstractTest {

    @Test
    void openNewAccountTest (){
        new TopMenuPage(getDriver())
                .clickAboutUs();

        new VideoStartsInAboutUsPage(getDriver())
                .videoStart();
        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@id='example-video']/video")).isEnabled(), "Видео не включается");

        new VideoStartsInAboutUsPage(getDriver())
                .pauseVideo();
       
    }
}
