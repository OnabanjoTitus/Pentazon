package com.pentazon.product;

import com.pentazon.exceptions.ProductException;

import java.util.Map;

/**
 * provides services for dealing with products in pentazon
 */
public interface ProductService {
    /**
     *  search for product with specified productId
     * @param productId
     * @return
     */

    public Product findProductById(String productId) throws ProductException;
    /**
     *  search for product with specified productId
     * @param product
     * @return
     */

    public boolean addProduct(Product product) throws ProductException;

    public boolean removeProduct(Product product) throws ProductException;

    public Map<String, Product> getAllProducts();
}
