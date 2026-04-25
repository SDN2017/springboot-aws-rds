package com.shaldev.spring_aws_rds.repository;

import com.shaldev.spring_aws_rds.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
