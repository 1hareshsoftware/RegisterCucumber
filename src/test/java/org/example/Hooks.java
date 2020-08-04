package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.BasePage;
import org.BrowserSelector;
import org.LoadProp;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
        BrowserSelector browserSelector = new BrowserSelector();
        LoadProp loadProp = new LoadProp();
        //static String timestamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());


        @Before

        public void openBrowser() {
            browserSelector .setUPBrowser();
            driver.get(loadProp.getProperty("url"));
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
            driver.manage().window().maximize();
            //driver.get("https://demo.nopcommerce.com");
        }

        @After


        public void closeBrowser () {

           //driver.close();
        }



}
