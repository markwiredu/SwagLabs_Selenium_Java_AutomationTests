package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.CheckoutPage;
import page.LoginPage;
import page.ProductsPage;
import page.ShoppingCartPage;

/**
 * Basisklasse für alle Testklassen.
 * <p>
 * Diese Klasse kümmert sich um die Initialisierung und das Schließen des Browsers
 * sowie um die Bereitstellung der Page-Objekte für die einzelnen Tests.
 * Alle Testklassen, die von {@code BaseTest} erben, können direkt auf die Page-Objekte zugreifen.
 */
public class BaseTest {

    /** Der WebDriver, der den Browser steuert */
    private WebDriver driver;

    /** Page-Objekt für die Login-Seite */
    protected LoginPage loginPage;

    /** Page-Objekt für die Produktübersichtsseite */
    protected ProductsPage productsPage;

    /** Page-Objekt für die Checkout-Seite */
    protected CheckoutPage checkoutPage;

    /** Page-Objekt für die Warenkorb-Seite */
    protected ShoppingCartPage shoppingCartPage;

    /**
     * Initialisiert den Browser und öffnet die Startseite der Anwendung.
     * <p>
     * Außerdem werden alle Page-Objekte erstellt, sodass sie in den Tests direkt genutzt werden können.
     */
    @BeforeClass
    public void setUo(){
        driver = new ChromeDriver();               // Startet eine neue Chrome-Browser-Instanz
        driver.manage().window().maximize();       // Maximiert das Browserfenster
        driver.get("https://www.saucedemo.com/");  // Öffnet die Startseite der Webanwendung

        // Initialisierung der Page-Objekte (Page Object Model)
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    /**
     * Schließt den Browser nach Abschluss aller Tests in der Klasse.
     */
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
