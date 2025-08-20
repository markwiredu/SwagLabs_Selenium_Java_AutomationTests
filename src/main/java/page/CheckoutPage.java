package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Repräsentiert die Checkout-Seite der Webanwendung.
 * <p>
 * Diese Klasse ist Teil des Page Object Models (POM).
 * Sie kapselt alle Eingabefelder und Buttons, die auf der Checkout-Seite benötigt werden,
 * sowie die zugehörigen Aktionen (Text eingeben, Button klicken).
 */
public class CheckoutPage {

    /** Der WebDriver, der den Browser steuert */
    private WebDriver driver;

    /** Locator für das Eingabefeld "Vorname" */
    By firstNameField = By.id("first-name");

    /** Locator für das Eingabefeld "Nachname" */
    By lastNameField = By.id("last-name");

    /** Locator für das Eingabefeld "Postleitzahl" */
    By postalCodeField = By.id("postal-code");

    /** Locator für den Button "Continue" */
    By continueButton = By.id("continue");

    /** Locator für den Button "Finish" */
    By finishButton = By.id("finish");

    /**
     * Konstruktor für die CheckoutPage.
     *
     * @param driver WebDriver-Instanz, die von außen übergeben wird
     */
    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Gibt den Vornamen in das Eingabefeld ein.
     *
     * @param firstNameInput der einzugebende Vorname
     */
    public void enterFirstName(String firstNameInput){
        driver.findElement(firstNameField).sendKeys(firstNameInput);
    }

    /**
     * Gibt den Nachnamen in das Eingabefeld ein.
     *
     * @param lastNameInput der einzugebende Nachname
     */
    public void enterLastName(String lastNameInput){
        driver.findElement(lastNameField).sendKeys(lastNameInput);
    }

    /**
     * Gibt die Postleitzahl in das Eingabefeld ein.
     *
     * @param postalcodeInput die einzugebende Postleitzahl
     */
    public void enterPostalcode(String postalcodeInput){
        driver.findElement(postalCodeField).sendKeys(postalcodeInput);
    }

    /**
     * Klickt auf den "Continue"-Button, um den Checkout-Prozess fortzusetzen.
     */
    public void clickContinue(){
        driver.findElement(continueButton).click();
    }

    /**
     * Klickt auf den "Finish"-Button, um den Checkout-Prozess abzuschließen.
     */
    public void clickFinishButton(){
        driver.findElement(finishButton).click();
    }
}
