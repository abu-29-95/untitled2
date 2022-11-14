package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class VideoStartsInAboutUsPage extends AbstractPage{

    @FindBy(id = "example-video")
    private WebElement video;

    @FindBy(xpath = ".//*[@title='Pause']")
    private WebElement pauseVideo;


    public VideoStartsInAboutUsPage(WebDriver driver) {
        super(driver);
    }

    public VideoStartsInAboutUsPage videoStart(){
        this.video.click();
        return this;
    }

    public VideoStartsInAboutUsPage pauseVideo(){
        this.pauseVideo.click();
        return this;
    }




}
