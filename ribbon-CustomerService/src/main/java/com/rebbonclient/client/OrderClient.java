package com.rebbonclient.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.rebbonclient.model.ProductEntity;

@FeignClient(name = "http://orderservice/product/")
public interface OrderClient {

	
	@GetMapping("/info")
	public String info();
	
	@GetMapping
	public ResponseEntity<List<ProductEntity>> getAllProducts();
	
	
	@GetMapping("/{id}")
	public ResponseEntity<List<ProductEntity>> getProductById(@PathVariable("id")Long id);
	
	@GetMapping("/prodreqById")
	public ResponseEntity<List<ProductEntity>> getProdByreqId(@RequestParam("id") long id);
	
	
}
