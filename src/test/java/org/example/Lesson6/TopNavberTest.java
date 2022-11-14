package org.example.Lesson6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopNavberTest extends AbstractTest {
    @Test
    void clickContact() {
        new TopMenuPage(getDriver())
                .clickContact();
        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@id='exampleModal']/div/div")).isDisplayed());
    }

    @Test
    void clickAboutUs() {
        new TopMenuPage(getDriver())
                .clickAboutUs();
        Assertions.assertTrue(getDriver().findElement(By.id("videoModal")).isDisplayed());
    }

    @Test
    void clickCart() {
        new TopMenuPage(getDriver())
                .clickCart();
        Assertions.assertTrue(getDriver().getCurrentUrl().equals("https://www.demoblaze.com/cart.html"));
    }
    @Test
    void clickLogIn() {
        new TopMenuPage(getDriver())
                .clickLogIn();
        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@id='logInModal']/div/div")).isDisplayed());
    }
    @Test
    void clickSingIn() {
        new TopMenuPage(getDriver())
                .clickSingIn();
        Assertions.assertTrue(getDriver().findElement(By.id("signInModal")).isDisplayed());
    }
    @Test
    void clickHome() {
        new TopMenuPage(getDriver())
                .clickHome();
        Assertions.assertTrue(getDriver().getCurrentUrl().equals("https://www.demoblaze.com/index.html"));
    }


}


