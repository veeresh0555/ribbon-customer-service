package com.rebbonclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rebbonclient.client.OrderClient;
import com.rebbonclient.model.ProductEntity;

@RestController
@RequestMapping("/ribbon-cust")
public class RibbonController {

	@Autowired
	OrderClient orderclient;
	
	@GetMapping("/info")
	public String info() {
		return orderclient.info();
	}
	
	@GetMapping
	public ResponseEntity<List<ProductEntity>> getAllProd(){
		return orderclient.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<ProductEntity>> getprodById(@PathVariable("id")Long id){
		return orderclient.getProductById(id);
	}
	
	
   @GetMapping("/reqId")
	public ResponseEntity<List<ProductEntity>> getprodByRequestId(@RequestParam("id")Long id){
		
	   
	   return orderclient.getProdByreqId(id);
	} 
	
		
}
