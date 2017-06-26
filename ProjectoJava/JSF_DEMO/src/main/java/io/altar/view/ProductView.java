package io.altar.view;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.model.Product;
import io.altar.service.ProductService;

@Named("productView")
@RequestScoped
public class ProductView implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
    private ProductService productService;

	private Product product = new Product();

    public void addProduct() {
    	productService.createProducts(product);		
    }
    
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
//    
//     public ProductService getProductService() {
//        return productService;
//    }
// 
//    public void setProductService(ProductService productService) {
//        this.productService = productService;
//    } 
    
    public Collection<Product> getProducts() {
        return productService.getProducts();
    }
    

    
}
