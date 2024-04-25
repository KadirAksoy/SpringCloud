package com.kadiraksoy.SpringCloud.service;

import com.kadiraksoy.SpringCloud.dto.FakeStoreProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FakeStoreService {

    private final FakeStoreClient fakeStoreClient;

    public FakeStoreService(FakeStoreClient fakeStoreClient) {
        this.fakeStoreClient = fakeStoreClient;
    }

    public List<FakeStoreProductDto> getAllProducts() {
        log.info("getAllProduct çalışıyor");
        return fakeStoreClient.getAllProducts();
    }

    public FakeStoreProductDto getProductById(long id) {
        return fakeStoreClient.getProductById(id);
    }
}
