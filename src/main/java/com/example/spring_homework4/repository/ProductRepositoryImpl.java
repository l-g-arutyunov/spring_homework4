package com.example.spring_homework4.repository;

import com.example.spring_homework4.entity.Product;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Getter
@RequiredArgsConstructor
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final Set<Product> productSet = new HashSet<>();

    @Override
    public void addProduct(Product product) {
        productSet.add(product);
    }
}
