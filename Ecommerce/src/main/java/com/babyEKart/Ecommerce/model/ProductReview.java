package com.babyEKart.Ecommerce.model;

import lombok.Data;

@Data
public class ProductReview {
    private final Long productReviewId;
    private final String productReviewDescription;
    private final Long productId;
}
