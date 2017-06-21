package io.altar.view;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import io.altar.model.Product;
import io.altar.service.ProductService;

@ManagedBean(name="ProductView")
@ViewScoped 

public class ProductView implements Serializable{
	
	private List <Product> products;
	
    @ManagedProperty("#{ProductService}")
    private ProductService productservice;
 
    
    @PostConstruct
    public void init() {
        products = productservice.createProduct();
    }
    
    public List<Product> getProduct() {
        return products;
    }
 
    public void setService(ProductService productservice) {
        this.productservice = productservice;
    }
    public ProductService getService(){
    	return productservice;
    }
}
