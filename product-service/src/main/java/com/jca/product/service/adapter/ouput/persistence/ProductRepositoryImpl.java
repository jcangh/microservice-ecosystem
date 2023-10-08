package com.jca.product.service.adapter.ouput.persistence;

import com.jca.common.service.domain.Product;
import com.jca.product.service.adapter.input.mapper.ProductMapper;
import com.jca.product.service.adapter.ouput.persistence.entity.ProductEntity;
import com.jca.product.service.application.port.output.ProductRepository;
import com.jca.product.service.domain.ProductSearch;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Component
public class ProductRepositoryImpl implements ProductRepository {
    private final MysqlProductRepository repository;
    private final ProductMapper mapper;

    @Override
    @Transactional
    public Product create(Product product) {
        ProductEntity entity = mapper.toProductEntity(product);
        repository.save(entity);
        return mapper.toProduct(entity);
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(String productId) {

    }

    @Override
    public Optional<Product> getById(String productId) {
        return Optional.empty();
    }

    @Override
    public List<Product> searchProduct(ProductSearch productSearch) {
        return null;
    }
}
