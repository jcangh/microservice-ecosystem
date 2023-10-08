package com.jca.product.service.adapter.input.mapper;

import com.jca.common.service.domain.Product;
import com.jca.product.service.adapter.ouput.persistence.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductEntity entity){
        return null;
    }

    public ProductEntity toProductEntity(Product product){
        return null;
    }
}
