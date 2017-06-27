package io.altar.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.model.Product;
import io.altar.repository.ProductRepository;

@Named("productService")
@RequestScoped
public class ProductService {
	
	private ProductRepository ProductList = ProductRepository.getInstance();
	
	public void createProducts(Product product) {
		
		ProductList.PutOnListProduct(product);
	}
	
	public void removeProducts(Product product){
		ProductList.remove(product.getId());
	}
	
	public Collection<Product> getProducts(){
		return ProductList.getall();
	}
}
