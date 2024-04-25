package com.kadiraksoy.SpringCloud.controller;

import com.kadiraksoy.SpringCloud.dto.FakeStoreProductDto;
import com.kadiraksoy.SpringCloud.service.FakeStoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fakestore")
public class FakeStoreController {


    private final FakeStoreService fakeStoreService;

    public FakeStoreController(FakeStoreService fakeStoreService) {
        this.fakeStoreService = fakeStoreService;
    }


    @GetMapping("/products")
    public List<FakeStoreProductDto> getAllProducts() {
        return fakeStoreService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public FakeStoreProductDto getProductById(@PathVariable("id") long id) {
        return fakeStoreService.getProductById(id);
    }
}
