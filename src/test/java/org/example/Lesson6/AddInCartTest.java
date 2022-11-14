package org.example.Lesson6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddInCartTest extends AbstractTest {
    @Test
    void addInCartTest (){

       new AddInCartPage (getDriver())
               .addInCart();

        Assertions.assertFalse(getDriver().getWindowHandle().isEmpty(), "Не добавлено в корзину");
    }
}
