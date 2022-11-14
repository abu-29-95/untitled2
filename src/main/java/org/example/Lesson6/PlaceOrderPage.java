package org.example.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage extends AddInCartPage{
    @FindBy(xpath = ".//*[@id='page-wrapper']//button[text()='Place Order']")
    private WebElement placeOrder;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id= "country")
    private WebElement country;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "card")
    private WebElement card;

    @FindBy(id = "month")
    private WebElement month;

    @FindBy(id = "year")
    private WebElement year;


    @FindBy(xpath = ".//*[@id='orderModal']//button[text()='Purchase']")
    private WebElement submitOrder;



    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }

    public PlaceOrderPage setName(String name) {
        this.name.click();
        this.name.sendKeys(name);
        return this;
    }

    public PlaceOrderPage setCountry(String country) {
        this.country.click();
        this.country.sendKeys(country);
        return this;
    }

    public PlaceOrderPage setCity(String city) {
        this.city.click();
        this.city.sendKeys(city);
        return this;
    }

    public PlaceOrderPage setCard(String card) {
        this.card.click();
        this.card.sendKeys(card);
        return this;
    }

    public PlaceOrderPage setMonth(String month) {
        this.month.click();
        this.month.sendKeys(month);
        return this;
    }

    public PlaceOrderPage setYear(String year) {
        this.year.click();
        this.year.sendKeys(year);
        return this;
    }

    public void buttonplaceOrder(){
        this.placeOrder.click();

}

    public void setPlaceOrder(String name, String country, String city, String card, String month, String year){

        Actions order = new Actions(getDriver());
       order
                .sendKeys(this.name,name)
                .sendKeys(this.country, country)
                .sendKeys(this.city, city)
                .sendKeys(this.card, card)
                .sendKeys(this.month, month)
                .sendKeys(this.year, year)
                .click(this.submitOrder)
                .build()
                .perform();
    }

}
