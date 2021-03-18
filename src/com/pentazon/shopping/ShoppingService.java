package com.pentazon.shopping;

import com.pentazon.customers.Buyer;
import com.pentazon.exceptions.CheckOutException;

public interface ShoppingService {

    public Order checkout(Buyer buyer) throws CheckOutException;

}
