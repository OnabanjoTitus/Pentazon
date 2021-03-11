package com.pentazon.product;

import com.pentazon.exceptions.ProductException;

/**
 * provides services for dealing with products in pentazon
 */
public interface ProductService {
    /**
     *  search for product with specified productId
     * @param productId
     * @return
     */
    Product findProductById(String productId) throws ProductException;

}
