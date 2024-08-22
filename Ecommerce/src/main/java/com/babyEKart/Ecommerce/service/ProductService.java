package com.babyEKart.Ecommerce.service;

import com.babyEKart.Ecommerce.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProductService {

    public Flux<Product> findAllProducts(){
        Product product1 = Product.builder().productId(1L).productDescription("Diapers").productName("CHaddi Diapers").build();
        return Flux.just(product1);
    }
}
