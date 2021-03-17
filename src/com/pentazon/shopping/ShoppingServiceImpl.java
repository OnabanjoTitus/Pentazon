package com.pentazon.shopping;

import com.pentazon.customers.Buyer;
import com.pentazon.customers.Customer;
import com.pentazon.exceptions.CheckOutException;

public class ShoppingServiceImpl implements ShoppingService {

    @Override
    public boolean checkout(Buyer buyer) throws CheckOutException {
       isValidCheckout(buyer);
       return false;
    }

    private boolean isValidCheckout(Buyer buyer) throws CheckOutException{
        if(buyer == null){
            throw new CheckOutException("No buyer found at checkout");
        }
        if(buyer.getCart() == null){
//            todo log error
            throw new CheckOutException("No Cart found at checkout");
        }

        if(buyer.getCart().getProduct().isEmpty()){
            throw new CheckOutException("Cart is empty at checkout");
        }

        if(buyer.getCards() == null){
//            todo log error
            throw new CheckOutException("No payment cards found at checkout found at checkout");
        }

        if(buyer.getCards() == null || buyer.getCards().isEmpty()){
//            todo log error
            throw new CheckOutException("No payment cards found at checkout found at checkout");
        }

        return true;
    }


}
