package org.store.online.categories.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.store.online.categories.model.CategoryProductEntity;

public interface CategoryProductRepository extends MongoRepository<CategoryProductEntity, String> {
}
