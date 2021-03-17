package com.pentazon.product;

import com.pentazon.customers.Buyer;
import com.pentazon.exceptions.CheckOutException;
import com.pentazon.exceptions.ProductException;

public class ProductServiceImpl  implements ProductService{
    private ProductDB productDB = new ProductDB();

    /**
     * search for product with specified productId
     *
     * @param productId
     * @return
     * @@throws productException
     */


    @Override
    public Product findProductById(String productId) throws ProductException {
        return productDB.getProductsById(productId);
    }

}
