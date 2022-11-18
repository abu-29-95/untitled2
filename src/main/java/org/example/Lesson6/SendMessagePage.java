package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SendMessagePage extends AbstractPage{
    @FindBy(id = "recipient-email")
    private WebElement email;

    @FindBy(xpath = ".//*[@id='recipient-name']")
    private WebElement name;

    @FindBy(id= "message-text")
    private WebElement message;

    @FindBy(xpath = ".//*[@id='exampleModal']//button[text()='Send message']")
    private WebElement submitMessage;

    public SendMessagePage(WebDriver driver) {
        super(driver);
    }

    public void sendMessage(String email, String name, String message){

        Actions sendMessage = new Actions(getDriver());
        sendMessage
                .sendKeys(this.email,email)
                .sendKeys(this.name, name)
                .sendKeys(this.message, message)
                .click(this.submitMessage)
                .build()
                .perform();
    }
}
