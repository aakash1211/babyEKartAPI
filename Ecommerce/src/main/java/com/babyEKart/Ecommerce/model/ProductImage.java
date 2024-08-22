package com.babyEKart.Ecommerce.model;

import lombok.Data;

@Data
public class ProductImage {
    private final Long productImageId;
    private final String productImageUrl;
    private final String alternateText;
    private final Boolean isPrimaryProductImage;
    private final Long productId;
}
