package org;

import org.openqa.selenium.By;

import static org.Utils.utils.ClickOnElement;

public class HomePage extends Utils {

    private By registerbutton = By.className("ico-register");

    public void registerBtn () {
        ClickOnElement (registerbutton);
    }
}
