package com.balsam.Login;

import com.balsam.pages.HomePage;
import com.balsam.utilities.BrowserActions;
import com.balsam.utilities.SimpleLogger;

public class ShoppingCartUpdates {

    public static void main(String[] args) {
        try {
            HomePage homePage = new HomePage();
            BrowserActions browserActions = new BrowserActions();
            
            browserActions.setup();
            homePage.performSearch("Christmas Tree");
            browserActions.teardown();
            
        } catch (Exception e) {
            SimpleLogger.info(e.getMessage());
        }
    }
}
