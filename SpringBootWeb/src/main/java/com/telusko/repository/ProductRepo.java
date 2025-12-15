package com.telusko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.telusko.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
}
