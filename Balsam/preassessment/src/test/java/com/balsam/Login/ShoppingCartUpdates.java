package com.balsam.Login;

import com.balsam.pages.HomePage;
import com.balsam.pages.ProductsSelectionPage;
import com.balsam.pages.ResultsPage;
import com.balsam.utilities.BrowserActions;
import com.balsam.utilities.SimpleLogger;

public class ShoppingCartUpdates {

    public static void main(String[] args) {
        try {
            BrowserActions browserActions = new BrowserActions();

            HomePage homePage = new HomePage();
            ResultsPage resultsPage = new ResultsPage();
            ProductsSelectionPage prodSelectPage = new ProductsSelectionPage();
            
            browserActions.setup();
            
            homePage.performSearch("Christmas Tree");
            resultsPage.selectProduct(3);
            prodSelectPage.addAnItemToCart();

            browserActions.teardown();
            
        } catch (Exception e) {
            SimpleLogger.info(e.getMessage());
        }
    }
}
