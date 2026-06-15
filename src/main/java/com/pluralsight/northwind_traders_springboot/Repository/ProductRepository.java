package com.pluralsight.northwind_traders_springboot.Repository;



import com.pluralsight.northwind_traders_springboot.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <Product, Integer> {
    List<Product> findByCategoryAndPriceAndName(String category, String name, double price);
}
