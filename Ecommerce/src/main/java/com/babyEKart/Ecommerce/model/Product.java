package com.babyEKart.Ecommerce.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class Product {
    private final Long productId;
    private final String productName;
    private final String productDescription;
    private final Integer stockQuantity;
    private final ProductCategory productCategory;
    private final Long brandId;
    private final Date createdDate;
    private final Date lastUpdatedDate;
    private final List<ProductReview> productReviewList;
    private final Brand brand;
    private final ProductImage productImage;
    private final Float productSellingPrice;
    private final Float discount;
    private final Float productFinalSellingPriceAfterDiscount;
    private final Integer sizeUS;
    private final Integer sizeUK;
    private final Size size;

}
