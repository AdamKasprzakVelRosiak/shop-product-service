package com.shop.product.service;

import com.shop.product.mapper.ProductConfigurationMapper;
import com.shop.product.model.Product;
import com.shop.product.model.ProductConfiguration;
import com.shop.product.model.ProductConfigurationCreateRequest;
import com.shop.product.model.ProductConfigurationDto;
import com.shop.product.repository.ProductConfigurationRepository;
import com.shop.product.repository.ProductRepository;
import com.shop.product.ProductType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductConfigurationService {

    private final ProductConfigurationRepository productConfigurationRepository;
    private final ProductConfigurationMapper productConfigurationMapper;
    private final ProductRepository productRepository;

    public ProductConfigurationDto createProductConfiguration(ProductConfigurationCreateRequest productConfigurationCreateRequest){
        ProductConfiguration productConfiguration = productConfigurationMapper.toEntity(productConfigurationCreateRequest);
        if (productConfigurationCreateRequest.sellAsProduct()) {
            Product product = productConfigurationMapper.toProduct(productConfigurationCreateRequest);
            product.setType(ProductType.ELECTRONICS);

            Product savedProduct = productRepository.save(product);
            productConfiguration.setProductId(savedProduct.getId());
        }

        ProductConfiguration saved = productConfigurationRepository.save(productConfiguration);
        return productConfigurationMapper.toDto(saved);
    }

}
