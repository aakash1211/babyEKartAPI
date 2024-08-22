package com.babyEKart.Ecommerce.model;

import lombok.Data;

import java.util.List;

@Data
public class ProductCategory {
    private final Long productCategoryId;
    private final String productCategoryDescription;
    private final Long productId;
    private final String categoryName;
    private final List<String> categoryTags;

}
