package com.pentazon.product;

import com.pentazon.exceptions.ProductException;

public class ProductServiceImpl  implements ProductService{
    private ProductRepoMock productRepoMock= new ProductRepoMock();

    /**
     * search for product with specified productId
     *
     * @param productId
     * @return
     * @@throws productException
     */
    @Override
    public Product findProductById(String productId) throws ProductException {
        return productRepoMock.getProductsById(productId);
    }

}
