package com.jca.product.service.application.port.input;

import com.jca.common.service.domain.Product;
import com.jca.product.service.domain.ProductSearch;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product create(Product product);

    void update(Product product);

    void delete(String productId);

    Optional<Product> getById(String productId);

    List<Product> searchProduct(ProductSearch productSearch);
}
