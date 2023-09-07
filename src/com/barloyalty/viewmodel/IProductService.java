package com.barloyalty.viewmodel;

import com.barloyalty.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> search(String query);
}
