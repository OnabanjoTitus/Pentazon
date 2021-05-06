package com.pentazon.product;


import com.pentazon.exceptions.ProductException;

import java.util.Map;

public class ProductServiceImpl  implements ProductService{
    private ProductDB productDB = new ProductDB();

    @Override
    public Product findProductById(String productId) throws ProductException {
        return productDB.getProductsById(productId);
    }

    @Override
    public boolean addProduct(Product product) throws ProductException {
        if(isValidProduct(product)){
            productDB.getMockProducts().put(product.getProductId(),product);
            return true;
        }
        return false;
    }

    private boolean isValidProduct(Product product) throws ProductException {
        if(product==null){
            throw new ProductException("Cannot add a null product");
        }
        if(product.getProductName()==null || product.getProductName().equals("")){
            throw new ProductException("Cannot add a null product");
        }
        if(product.getProductPrice()==null){
            throw new ProductException("Cannot add a null product");
        }
        return true;
    }

    @Override
    public boolean removeProduct(Product product) throws ProductException {
        return false;
    }

    @Override
    public Map<String, Product> getAllProducts() {
        return productDB.getMockProducts();
    }

}
