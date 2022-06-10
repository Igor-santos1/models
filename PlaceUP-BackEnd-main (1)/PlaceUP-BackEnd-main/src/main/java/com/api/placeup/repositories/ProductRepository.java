package com.api.placeup.repositories;

import com.api.placeup.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Integer> {
}
