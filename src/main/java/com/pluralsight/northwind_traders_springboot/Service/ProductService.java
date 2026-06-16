package com.pluralsight.northwind_traders_springboot.Service;

import com.pluralsight.northwind_traders_springboot.Model.Product;
import com.pluralsight.northwind_traders_springboot.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductByID(int id){
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }
}
