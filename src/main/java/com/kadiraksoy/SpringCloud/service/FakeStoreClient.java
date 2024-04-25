package com.kadiraksoy.SpringCloud.service;

import com.kadiraksoy.SpringCloud.dto.FakeStoreProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "fakeStoreClient", url = "https://fakestoreapi.com")
public interface FakeStoreClient {

    @GetMapping("/products")
    List<FakeStoreProductDto> getAllProducts();

    @GetMapping("/products/{id}")
    FakeStoreProductDto getProductById(@PathVariable("id") Long id);
}