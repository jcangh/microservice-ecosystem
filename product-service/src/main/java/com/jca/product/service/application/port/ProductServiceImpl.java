package com.jca.product.service.application.port;

import com.jca.common.service.domain.Product;
import com.jca.product.service.application.port.input.ProductService;
import com.jca.product.service.application.port.output.ProductRepository;
import com.jca.product.service.domain.ProductSearch;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.create(product);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public void delete(String productId) {
        productRepository.delete(productId);
    }

    @Override
    public Optional<Product> getById(String productId) {
        return productRepository.getById(productId);
    }

    @Override
    public List<Product> searchProduct(ProductSearch productSearch) {
        return productRepository.searchProduct(productSearch);
    }
}
