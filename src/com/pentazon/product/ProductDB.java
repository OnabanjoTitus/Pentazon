package com.pentazon.product;

import com.pentazon.exceptions.ProductException;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ProductDB {
    private Map<String,Product> mockProducts;

    public ProductDB(){
        mockProducts= new HashMap<>();

        Product plantainChips= new Product("Adunni Chips","Savoury PlantainChips",new BigDecimal(50));
        plantainChips.setProductId("AD001");
        mockProducts.put(plantainChips.getProductId(), plantainChips);

        Product noseMask=new Product();
        noseMask.setProductId("AD002");
        noseMask.setProductName("Bomu e Nose Mask");
        noseMask.setProductDescription("Best in class nose mask");
        noseMask.setProductPrice(new BigDecimal(4500));
        mockProducts.put(noseMask.getProductId(), noseMask);

        Product shirt=new Product("Vintage Shirt","Vintage Versace",new BigDecimal(5000));
        shirt.setProductId("AD003");
        mockProducts.put(shirt.getProductId(), shirt);

    }
    public Map<String,Product> getMockProducts(){
        return mockProducts;
    }

    public Product getProductsById(String id) throws ProductException {
        Product result=mockProducts.get(id);
        if(result==null){
            StringBuilder message=new StringBuilder("Product with id ");
            message.append(id);
            message.append(" not found.");
            throw new ProductException(message.toString());
        }
        return result;
    }
}
