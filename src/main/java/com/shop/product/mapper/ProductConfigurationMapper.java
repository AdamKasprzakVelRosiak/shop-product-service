package com.shop.product.mapper;

import com.shop.product.model.ProductConfiguration;
import com.shop.product.model.ProductConfigurationCreateRequest;
import com.shop.product.model.ProductConfigurationDto;
import com.shop.product.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductConfigurationMapper {
    ProductConfiguration toEntity(ProductConfigurationCreateRequest request);

    ProductConfigurationDto toDto(ProductConfiguration product);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "type", ignore = true)
    Product toProduct(ProductConfigurationCreateRequest request);
}
