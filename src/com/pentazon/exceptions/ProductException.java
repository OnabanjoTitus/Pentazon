package com.pentazon.exceptions;

import java.security.PrivilegedActionException;

public class ProductException extends PentazonException{


    public ProductException(String message) {
        super(message);
    }


    public ProductException(String message, Throwable cause) {
        super(message, cause);
    }


    public ProductException(Throwable cause) {
        super(cause);
    }


}
