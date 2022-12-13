package com.luv2code.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.dao.ProductCategoryRepository;
import com.luv2code.entity.ProductCategory;

@RestController
public class Controller {

@Autowired
ProductCategoryRepository productCategoryRepository;
	
	@GetMapping("/product-category")
	public List<ProductCategory> getAllProducts(){
		List<ProductCategory> ans= productCategoryRepository.findAll();
		for(ProductCategory p:ans)
			System.out.println(p);
		
		System.out.println("here");
		return ans;
	}
	@PostMapping("/product-category")
	public ProductCategory addCategory(@RequestBody ProductCategory pr){
//		System.out.println(pr.getCategoryName());
	
		return productCategoryRepository.save(pr);
	}
	
}
