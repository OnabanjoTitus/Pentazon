package com.pentazon.product;

import com.pentazon.exceptions.ProductException;
import com.pentazon.shopping.Cart;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {
    ProductService productService;
    Cart cart;
    @BeforeEach
    void setUp() {
        productService= new ProductServiceImpl();
        cart= new Cart();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void findProduct(){
        Product product= null;
        try {
            product = productService.findProductById("AD001");
        } catch (ProductException e) {
            e.printStackTrace();
        }
        assertNotNull(product);
    }
    @Test
    void findProductsWithInvalidId(){
        assertThrows(ProductException.class,()->productService.findProductById("AD007"));
    }

}