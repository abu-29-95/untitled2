package org.example.Lesson6;


import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@Story("Я как пользователь хочу разместить заказ чтобы сделать покупку")
public class PlaceOrderTest extends AbstractTest {

    @Test
    @DisplayName("Разместить заказ")
    @Description("Тест размещения заказа  для покупку")
    @Link("http://google.com")
    @Severity(SeverityLevel.BLOCKER)
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
