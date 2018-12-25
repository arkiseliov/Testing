package by.bsu.kiselev.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    @FindBy(id = "js-reservation-tab-status")
    private WebElement flightStatusTab;

    @FindBy(css = "a.btn_Y15.btn-search")
    private WebElement latestFlights;

    @FindBy(id = "js-reservation-tab-hotel-car")
    private WebElement bookHotel;

    @FindBy(css = "span.i.i-booking-com")
    private WebElement bookingHotel;



    public void selectFlightTab() {
        Actions actions = new Actions(driver);
        actions.moveToElement(flightStatusTab).click().perform();
    }

    public void selectLatestFlights() {
        Actions actions = new Actions(driver);
        actions.moveToElement(latestFlights).click().perform();
    }

    public void clickBookHotel() {
        Actions actions = new Actions(driver);
        actions.moveToElement(bookHotel).click().perform();
    }

    public void chooseHotel(){
        Actions actions = new Actions(driver);
        actions.moveToElement(bookingHotel).click().perform();
    }


}