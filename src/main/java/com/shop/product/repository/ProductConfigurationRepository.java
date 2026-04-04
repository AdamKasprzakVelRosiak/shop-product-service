package com.shop.product.repository;

import com.shop.product.model.ProductConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductConfigurationRepository extends JpaRepository<ProductConfiguration, Long>
{
}

