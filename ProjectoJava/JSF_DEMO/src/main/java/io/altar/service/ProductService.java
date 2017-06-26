package io.altar.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.model.Product;
import io.altar.repository.ProductRepository;

@Named("productService")
@RequestScoped
public class ProductService {
	
	private ProductRepository ProductList = new ProductRepository();
	
	public void createProducts(Product product) {
		
		ProductList.PutOnListProduct(product);
	}
	
	public Collection<Product> getProducts(){
		return ProductList.getall();
	}
}
