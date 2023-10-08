package com.jca.product.service.adapter.ouput.persistence;

import com.jca.product.service.adapter.ouput.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlProductRepository extends CrudRepository<ProductEntity,String> {

}
