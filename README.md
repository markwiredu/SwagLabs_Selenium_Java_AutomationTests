# Selenium Test Automation – SauceDemo Website

Dieses Projekt enthält automatisierte UI-Tests für die [SauceDemo](https://www.saucedemo.com/) Website, implementiert mit **Selenium WebDriver** und **TestNG** in Java.

---

## 📝 Projektbeschreibung

Das Ziel dieses Projekts ist es, typische Nutzeraktionen auf der SauceDemo-Webseite automatisiert zu testen, darunter:  

- Login mit Standard-Nutzerdaten  
- Produkte zum Warenkorb hinzufügen  
- Checkout-Prozess durchführen  

Die Tests sind so aufgebaut, dass sie wiederverwendbare **Page Objects** verwenden und die Selenium-WebDriver-Instanz zentral in einer **BaseTest-Klasse** verwaltet wird.

---

## 📂 Projektstruktur

#### src
- main
  - java
    - page # Page-Objekte für jede Seite
      - LoginPage.java
      - ProductsPage.java
      - ShoppingCartPage.java
      - CheckoutPage.java
- test
   - java
     - products # Testklassen
       - ProductsTests.java
     - base
       - BaseTest.java # Setup & Teardown für WebDriver

### Kurzbeschreibung

- **page**: Enthält Page-Object-Klassen, die die Benutzeraktionen auf den einzelnen Seiten kapseln.  
- **products**: Enthält die Testklassen, z. B. für Produkttests und Checkout.  
- **base**: Enthält die Basis-Testklasse `BaseTest`, die WebDriver initialisiert und beendet.  
