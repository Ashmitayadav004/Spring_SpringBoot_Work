package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.model.Product;
import com.telusko.repository.ProductRepo;


@Service
public class ProductService {

    @Autowired
    public ProductRepo repo;

    // ✅ Get all products
    public List<Product> getProducts() {
        return repo.findAll();
    }

    // ✅ Get product by ID
    public Product getProductById(int prodId) {
        Optional<Product> prod = repo.findById(prodId);
        return prod.orElse(null); // returns null if not found
    }

    // ✅ Add new product
    public void addProduct(Product prod) {
        repo.save(prod);
    }

    // ✅ Update product
    public void updateProduct(Product prod) {
        repo.save(prod); // save() acts as both insert & update
    }

    // ✅ Delete product by ID
    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
