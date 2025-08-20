package products;

import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Testklasse für die Produkt- und Checkout-Funktionalität der Webanwendung.
 * <p>
 * Diese Klasse erbt von {@link BaseTest} und nutzt die dort definierten Page-Objekte.
 * Sie führt zunächst einen Login durch und testet anschließend das Hinzufügen von Produkten zum Warenkorb
 * sowie den kompletten Checkout-Prozess.
 */
public class ProductsTests extends BaseTest {

    /**
     * Führt den Login auf der Webseite durch, bevor die Testfälle ausgeführt werden.
     * <p>
     * Diese Methode nutzt die LoginPage, um sich mit den Standard-Zugangsdaten einzuloggen.
     */
    @BeforeClass
    public void logInToWebsite() {
        loginPage.enterUsername("standard_user");   // Benutzernamen eingeben
        loginPage.enterPassword("secret_sauce");   // Passwort eingeben
        loginPage.clickButton();                    // Login-Button klicken
    }

    /**
     * Testet das Hinzufügen von Produkten zum Warenkorb und den Checkout-Prozess.
     * <p>
     * Folgende Schritte werden durchgeführt:
     * <ul>
     *     <li>Backpack und Bike Light zum Warenkorb hinzufügen</li>
     *     <li>Produktdetailseiten aufrufen und zurück zur Produktübersicht</li>
     *     <li>Zum Warenkorb wechseln</li>
     *     <li>Checkout starten und Benutzerinformationen eingeben</li>
     *     <li>Checkout abschließen</li>
     * </ul>
     */
    @Test
    public void clickProductandCheckout() {
        productsPage.addBackpackToCart();        // Backpack in den Warenkorb legen
        productsPage.clickBackpack();            // Detailseite des Backpacks öffnen
        productsPage.clickBackToProducts();      // Zurück zur Produktübersicht
        productsPage.addBikeLightToCart();       // Bike Light in den Warenkorb legen
        productsPage.clickBikeLight();           // Detailseite des Bike Lights öffnen
        productsPage.clickShoppingCart();        // Zum Warenkorb wechseln

        shoppingCartPage.clickCheckout();        // Checkout starten
        checkoutPage.enterFirstName("Mark");     // Vorname eingeben
        checkoutPage.enterLastName("Anthony");   // Nachname eingeben
        checkoutPage.enterPostalcode("22041");   // Postleitzahl eingeben
        checkoutPage.clickContinue();            // Weiter klicken
        checkoutPage.clickFinishButton();        // Checkout abschließen
    }
}
