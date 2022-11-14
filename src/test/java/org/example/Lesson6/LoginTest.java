package org.example.Lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginTest extends AbstractTest {
    @Test
    void loginTest (){

        new TopMenuPage(getDriver())
                .clickLogIn();

        new LogInPage(getDriver())
                .loginIn("Nike", "Test2022");

        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(new LogInPage(getDriver()).getWelcom()));
        Assertions.assertTrue(getDriver().findElement(By.id("nameofuser")).isDisplayed(),"ЗайдитgetDriver().findElement(By.id(\"nameofuser\"))е в систему");
    }

}
