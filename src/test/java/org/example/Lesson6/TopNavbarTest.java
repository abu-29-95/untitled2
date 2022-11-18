package org.example.Lesson6;


import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TopNavbarTest extends AbstractTest {
    @Epic("Верхняя панель навигации")
    @Feature("Вкладка Контакт")
    @Test
    @DisplayName("Переход в вкладку Контакт")
    @Description("Тест переход в вкладку Контакт после нажатия на нее")
    @Link("http://google.com")
    @Severity(SeverityLevel.CRITICAL)
    void clickContact() {
        new TopMenuPage(getDriver())
                .clickContact();
        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@id='exampleModal']/div/div")).isDisplayed());
    }

    @Epic("Верхняя панель навигации")
    @Feature("Вкладка О Нас")
    @Test
    @DisplayName("Переход в вкладку О Нас")
    @Description("Тест переход в вкладку О Нас после нажатия на нее")
    @Link("http://google.com")
    @Severity(SeverityLevel.CRITICAL)
    void clickAboutUs() {
        new TopMenuPage(getDriver())
                .clickAboutUs();
        Assertions.assertTrue(getDriver().findElement(By.id("videoModal")).isDisplayed());
    }

    @Epic("Верхняя панель навигации")
    @Feature("Вкладка Карта")
    @Test
    @DisplayName("Переход в вкладку Карта")
    @Description("Тест нажать на вкладку Карта и переход в нее")
    @Link("http://google.com")
    @Severity(SeverityLevel.BLOCKER)
    void clickCart() {
        new TopMenuPage(getDriver())
                .clickCart();
        Assertions.assertTrue(getDriver().getCurrentUrl().equals("https://www.demoblaze.com/cart.html"));
    }
    @Epic("Верхняя панель навигации")
    @Feature("Вкладка Войти")
    @Test
    @DisplayName("Переход в вкладку Войти")
    @Description("Тест нажать на вкладку Войти и переход в нее")
    @Link("http://google.com")
    @Severity(SeverityLevel.BLOCKER)
    void clickLogIn() {
        new TopMenuPage(getDriver())
                .clickLogIn();
        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@id='logInModal']/div/div")).isDisplayed());
    }
    @Feature("Вкладка Зарегистрироваться")
    @Test
    @DisplayName("Переход в вкладку Регистрации")
    @Description("Тест нажать на вкладку Регистрации и переход в нее")
    @Link("http://google.com")
    @Severity(SeverityLevel.BLOCKER)
    void clickSingUp() {
        new TopMenuPage(getDriver())
                .clickSingIn();
        Assertions.assertTrue(getDriver().findElement(By.id("signInModal")).isDisplayed());
    }

    @Feature("Вкладка Главная страница")
    @Test
    @DisplayName("Переход в вкладку Главная страница")
    @Description("Тест нажать на вкладку Главная страница и переход в нее")
    @Link("http://google.com")
    @Severity(SeverityLevel.CRITICAL)
    void clickHome() {
        new TopMenuPage(getDriver())
                .clickHome();
        Assertions.assertTrue(getDriver().getCurrentUrl().equals("https://www.demoblaze.com/index.html"));
    }


}


