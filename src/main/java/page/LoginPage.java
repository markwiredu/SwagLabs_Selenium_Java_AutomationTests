package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Repräsentiert die Login-Seite der Webanwendung.
 * <p>
 * Diese Klasse ist Teil des Page Object Models (POM).
 * Sie kapselt die Eingabe von Benutzername und Passwort
 * sowie den Klick auf den Login-Button.
 */
public class LoginPage {

    /** Der WebDriver, der den Browser steuert */
    private WebDriver driver;

    /**
     * Konstruktor für die LoginPage.
     *
     * @param driver WebDriver-Instanz, die von außen übergeben wird
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Gibt den Benutzernamen in das Eingabefeld ein.
     *
     * @param username der einzugebende Benutzername
     */
    public void enterUsername(String username){
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    /**
     * Gibt das Passwort in das Eingabefeld ein.
     *
     * @param password das einzugebende Passwort
     */
    public void enterPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    /**
     * Klickt auf den Login-Button, um den Anmeldeprozess auszuführen.
     * <p>
     * Nach einem erfolgreichen Login wird die {@link ProductsPage} geöffnet.
     *
     * @return eine neue Instanz von {@link ProductsPage}
     */
    public ProductsPage clickButton(){
        driver.findElement(By.id("login-button")).click();
        return new ProductsPage(driver);
    }
}
