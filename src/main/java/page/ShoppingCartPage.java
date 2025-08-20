package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Repräsentiert die Warenkorb-Seite der Webanwendung.
 * <p>
 * Diese Klasse ist Teil des Page Object Models (POM).
 * Sie kapselt die Aktionen, die im Warenkorb möglich sind,
 * wie z. B. den Checkout-Prozess zu starten.
 */
public class ShoppingCartPage {

    /** Der WebDriver, der den Browser steuert */
    private WebDriver driver;

    /**
     * Konstruktor für die ShoppingCartPage.
     *
     * @param driver WebDriver-Instanz, die von außen übergeben wird
     */
    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Klickt auf den "Checkout"-Button, um zur {@link CheckoutPage} zu wechseln.
     *
     * @return eine neue Instanz von {@link CheckoutPage}
     */
    public CheckoutPage clickCheckout(){
        driver.findElement(By.id("checkout")).click();
        return new CheckoutPage(driver);
    }
}
