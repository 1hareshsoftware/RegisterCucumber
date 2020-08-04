package org;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelector extends BasePage {

    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");

    public void setUPBrowser() {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\Resources\\BrowserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.out.println("Browser is Wrong");

        }

    }
}