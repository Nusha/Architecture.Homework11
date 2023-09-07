package com.barloyalty.factory;



import com.barloyalty.viewmodel.ProductService;

public class ProductServiceFactory implements IServiceFactory {
    @Override
    public ProductService createService() {
        return new ProductService();
    }
}