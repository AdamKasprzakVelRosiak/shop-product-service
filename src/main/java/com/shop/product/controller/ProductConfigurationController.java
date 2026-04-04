package com.shop.product.controller;

import com.shop.product.model.ProductConfigurationCreateRequest;
import com.shop.product.model.ProductConfigurationDto;
import com.shop.product.service.ProductConfigurationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-configurations")
@RequiredArgsConstructor
public class ProductConfigurationController {

    private final ProductConfigurationService productConfigurationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductConfigurationDto createProductConfiguration(@Valid @RequestBody ProductConfigurationCreateRequest request ) {
        return productConfigurationService.createProductConfiguration(request);
    }
}
