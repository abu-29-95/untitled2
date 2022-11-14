package org.example.Lesson6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PlaceOrderTest extends AbstractTest {


    @Test
    void placeOrderTest() {
        new TopMenuPage(getDriver())
                .clickCart();

        new PlaceOrderPage(getDriver())
                .buttonplaceOrder();

        new PlaceOrderPage(getDriver())
                .setPlaceOrder("Don","Kazakhstan","Almaty","1234","09","22");




        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[text()='Thank you for your purchase!']")).isDisplayed(), "Перевод не удался");

    }
}
