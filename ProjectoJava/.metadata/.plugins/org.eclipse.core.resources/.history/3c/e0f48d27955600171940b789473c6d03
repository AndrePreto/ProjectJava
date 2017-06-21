package io.altar.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import io.altar.model.Product;
import io.altar.repository.ProductRepository;

@ManagedBean(name = "ProductService")
@ApplicationScoped
public class ProductService {
	
	private ProductRepository ProductList = new ProductRepository();
	
    public List<Product> createProduct() {
    	List<Product> products = new ArrayList<Product>();
    	products.add(new Product(1,1,1,1));
  
		return products;
    }
}
