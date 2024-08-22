package com.babyEKart.Ecommerce.Controller;

import com.babyEKart.Ecommerce.model.Product;
import com.babyEKart.Ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping("/products")
    public Flux<Product> getAllProducts(){

        return service.findAllProducts();
    }

}
