package com.rijo.jabrapp.ui.startupScreen;

import com.rijo.jabrapp.domains.product.Item;
import com.rijo.jabrapp.domains.product.Products;

/**
 * Created by rijogeorge on 8/18/17.
 */

public class StartUpContract {
    interface View {
        void showProductList(Products products);
        void showProductNotAvailableScreen();
        void showProductDetailScreen(Item item);
        void showProductDetailNotAvailable();
        void addMoreDataToAdapter(Products products);
    }

    interface UserActionListener {
        void getProducts();
        void getProductDetails(int itemId);
        void getMoreProducts(String url);

    }
}
