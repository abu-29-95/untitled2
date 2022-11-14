package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddInCartPage extends AbstractPage{

    @FindBy(xpath = ".//*[@id='tbodyid']//a")
    private WebElement product;

    @FindBy(xpath = ".//*[@id='tbodyid']//a[text()='Add to cart']")
    private WebElement buttonAdd;


    public AddInCartPage(WebDriver driver) {
        super(driver);
    }

    public void addInCart(){
        this.product.click();
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(product));
        this.buttonAdd.click();
    }

}
