package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopMenuPage extends AbstractPage{
    @FindBy(xpath = ".//*[@id='navbarExample']//a[text()='Contact']")
    private WebElement contact;

    @FindBy(xpath = ".//*[@id='navbarExample']//a[text()='About us']")
    private WebElement aboutUs;

    @FindBy(id = "cartur")
    private WebElement cart;

    @FindBy(id = "login2")
    private WebElement logIn;

    @FindBy(id = "signin2")
    private WebElement signIn;

    @FindBy(xpath = ".//*[@id='navbarExample']//a[@href='index.html']")
    private WebElement home;

    @FindBy(xpath = ".//*[@id='exampleModal']//button[@class='close']/span")
    private WebElement contactClose;

    @FindBy(xpath = ".//*[@id='videoModal']//button[@class='close']/span")
    private WebElement aboutUsClose;

    @FindBy(xpath = ".//*[@id='logInModal']//button/span")
    private WebElement logInClose;

    @FindBy(xpath = ".//*[@id='signInModal']//button/span")
    private WebElement singInClose;


    public TopMenuPage (WebDriver driver){
        super(driver);
    }

    public TopMenuPage clickContact(){
       this.contact.click();
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(contact));
        return this;
    }

    public TopMenuPage clickAboutUs(){
        this.aboutUs.click();
        return this;
    }

    public TopMenuPage clickCart(){
        this.cart.click();
        return this;
    }
    public TopMenuPage clickLogIn(){
        this.logIn.click();
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(logIn));
        return this;
    }
    public TopMenuPage clickSingIn(){
        this.signIn.click();
        return this;
    }

    public TopMenuPage clickHome(){
        this.home.click();
        return this;
    }

    public TopMenuPage closeContact(){
        this.contactClose.click();
        return this;
    }

    public TopMenuPage closeAboutUs(){
        this.aboutUsClose.click();
        return this;
    }

    public TopMenuPage closeLogIn(){
        this.logInClose.click();
        return this;
    }

    public TopMenuPage closeSingIn(){
        this.singInClose.click();
        return this;
    }



}
