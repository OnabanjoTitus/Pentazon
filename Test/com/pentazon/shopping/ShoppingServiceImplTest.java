package com.pentazon.shopping;

import com.pentazon.customers.Buyer;
import com.pentazon.customers.Customer;
import com.pentazon.exceptions.CheckOutException;
import com.pentazon.payment.PaymentCard;
import com.pentazon.product.Product;
import com.pentazon.product.ProductDB;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingServiceImplTest {
    ShoppingService shoppingService=new ShoppingServiceImpl();
    private Buyer dozie;
    @BeforeEach
    void setUp() {
        ProductDB productDB= new ProductDB();
        dozie= new Buyer();
        PaymentCard fbnVisa= new PaymentCard("123456","Don Dozie", LocalDate.now());
        dozie.getCards().add(fbnVisa);
        Cart dozieCart= new Cart();
        dozieCart.addToCart(productDB.getMockProducts().get("AD001"),5);
        dozie.setCart(dozieCart);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void checkOutTestWithNullBuyer(){
        assertThrows(CheckOutException.class, ()-> shoppingService.checkout(null));

    }

    @Test
    void checkOutWithNullCart(){
        dozie.setCart(null);
        assertThrows(CheckOutException.class, ()-> shoppingService.checkout(dozie));

    }

    @Test
    void checkOutWithEmptyCart(){
        dozie.setCart(new Cart());
        assertThrows(CheckOutException.class, ()-> shoppingService.checkout(dozie));

    }

    @Test
    void checkOutTestWithNullPaymentCard(){
        dozie.setCards(null);
        assertThrows(CheckOutException.class, ()-> shoppingService.checkout(dozie));

    }

    @Test
    void checkOutTestWithNoPaymentCard(){
        dozie.setCards(Collections.EMPTY_LIST);
        assertThrows(CheckOutException.class, ()-> shoppingService.checkout(dozie));

    }


}