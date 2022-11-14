package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends AbstractPage{
    @FindBy(xpath= ".//*[@id='loginusername']")
    private WebElement login;

    @FindBy(id = "loginpassword")
    private WebElement password;

    @FindBy(xpath = ".//*[@id='logInModal']//button[text()='Log in']")
    private WebElement submit;


    @FindBy(id = "nameofuser")
    private WebElement welcom;

    public WebElement getWelcom() {
        return welcom;
    }

    public LogInPage(WebDriver driver){
        super(driver);
    }

    public void loginIn(){
        this.submit.click();
    }

    public LogInPage setLogin(String login){
        this.login.click();
        this.login.sendKeys(login);
        return this;
    }

    public LogInPage setPassword(String password){
        this.password.click();
        this.password.sendKeys(password);
        return this;
    }

    public void loginIn(String login, String password){

        Actions loginIn = new Actions(getDriver());
        loginIn
                .sendKeys(this.login,login)
                .click(this.password)
                .sendKeys(password)
                .click(this.submit)
                .build()
                .perform();
    }

}
