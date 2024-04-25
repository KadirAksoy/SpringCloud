package com.kadiraksoy.SpringCloud.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreProductDto {

    private Long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private RatingDto rating;

}
