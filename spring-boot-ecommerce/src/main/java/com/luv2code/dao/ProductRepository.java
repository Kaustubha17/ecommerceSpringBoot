package com.luv2code.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.luv2code.entity.Product;
/*
 * JpaRepository gives us CRUD  functions which can directly be used in services but using spring data here we have
 * skipped creating service and controller since we can directly access apis
 */
@CrossOrigin({"http://localhost:4200"})
public interface ProductRepository extends JpaRepository<Product, Long>{

	//these methods are provided by Spring data JPA we don't have to define these ourselves
	Page<Product> findByCategoryId(@Param("id") Long id,Pageable pageable);
	Page<Product> findByNameContaining(@Param("name") String name,Pageable pageable);
	
}
