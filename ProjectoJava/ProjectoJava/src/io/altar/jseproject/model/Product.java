package io.altar.jseproject.model;

public class Product {
	private int ProductId;
	private double Discount;
	private int IVA;
	private double PVP;
	
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	public int getIVA() {
		return IVA;
	}
	public void setIVA(int iVA) {
		IVA = iVA;
	}
	public double getPVP() {
		return PVP;
	}
	public void setPVP(double pVP) {
		PVP = pVP;
	}
		
}
