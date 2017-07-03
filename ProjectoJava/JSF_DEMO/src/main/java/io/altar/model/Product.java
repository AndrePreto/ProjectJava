package io.altar.model;

public class Product extends Entity{

	//private int productId;
	//private ArrayList<Integer> shelfIdLocation;
	private double discount;
	private int tax;
	private double salePrice;
	
//	public int getProductId() {
//		return productId;
//	}
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
	
//	public  ArrayList<Integer> getshelfIdlocation(){
//		return  shelfIdLocation;	
//	}
//	public void setshelfIdLocation (ArrayList<Integer> shelfIdLocation){
//		this.shelfIdLocation = shelfIdLocation;
//	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public Product() {
	}
	
	@Override
	public String toString(){
		return "|Id: " + getId() + "|Desconto: " + discount + " €" + "|IVA: " + tax + " %" + "|Preço de Venda: " + salePrice + " €" + "|";             
	}

}
