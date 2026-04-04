package com.shop.product.service;

import com.shop.product.mapper.ProductMapper;
import com.shop.product.model.Product;
import com.shop.product.model.ProductCreateRequest;
import com.shop.product.model.ProductDto;
import com.shop.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductDto createProduct(ProductCreateRequest request) {
        Product product = productMapper.toEntity(request);
        Product saved = productRepository.save(product);
        return productMapper.toDto(saved);
    }




}
