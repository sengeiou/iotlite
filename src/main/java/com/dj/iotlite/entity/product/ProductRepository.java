package com.dj.iotlite.entity.product;


import com.dj.iotlite.entity.organization.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends
        CrudRepository<Product, Long>,
        JpaSpecificationExecutor<Product>,
        JpaRepository<Product, Long> {

}
