package com.univerM.store.repository;

import com.univerM.store.entity.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository
        extends CrudRepository <ProductoEntity, Integer>{
}
