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
		
		ProductList.PutOnList(product);
	}
	
	public void removeProducts(Product product){
		ProductList.remove(product.getId());
	}
	
	public void editProducts(Product product){
		ProductList.editProduct(product.getId(), product.getDiscount(), product.getTax(), product.getSalePrice());
	}
	
	public Collection<Product> getProducts(){
		return ProductList.getall();
	}

}
