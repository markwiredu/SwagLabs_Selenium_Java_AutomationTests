package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Repräsentiert die Produktübersichtsseite der Webanwendung.
 * <p>
 * Diese Klasse ist Teil des Page Object Models (POM).
 * Sie kapselt alle Aktionen, die auf der Produktseite möglich sind,
 * wie z. B. Produkte ansehen, in den Warenkorb legen oder zum Warenkorb wechseln.
 */
public class ProductsPage {

    /** Der WebDriver, der den Browser steuert */
    private WebDriver driver;

    /**
     * Konstruktor für die ProductsPage.
     *
     * @param driver WebDriver-Instanz, die von außen übergeben wird
     */
    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Klickt auf das Produkt "Sauce Labs Backpack", um dessen Detailseite zu öffnen.
     */
    public void clickBackpack(){
        driver.findElement(By.id("item_4_title_link")).click();
    }

    /**
     * Fügt das Produkt "Sauce Labs Backpack" zum Warenkorb hinzu.
     */
    public void addBackpackToCart(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    /**
     * Klickt auf den "Back to Products"-Button, um von einer Produktdetailseite zurück zur Produktübersicht zu gelangen.
     */
    public void clickBackToProducts(){
        driver.findElement(By.id("back-to-products")).click();
    }

    /**
     * Klickt auf das Produkt "Sauce Labs Bike Light", um dessen Detailseite zu öffnen.
     */
    public void clickBikeLight(){
        driver.findElement(By.id("item_0_title_link")).click();
    }

    /**
     * Fügt das Produkt "Sauce Labs Bike Light" zum Warenkorb hinzu.
     */
    public void addBikeLightToCart(){
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    }

    /**
     * Klickt auf das Warenkorb-Symbol, um zur {@link ShoppingCartPage} zu wechseln.
     *
     * @return eine neue Instanz von {@link ShoppingCartPage}
     */
    public ShoppingCartPage clickShoppingCart(){
        driver.findElement(By.id("shopping_cart_container")).click();
        return new ShoppingCartPage(driver);
    }

}
