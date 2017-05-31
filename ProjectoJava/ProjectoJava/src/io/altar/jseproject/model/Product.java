package io.altar.jseproject.model;

public class Product {
	private int ProductId;
	private int Value;
	private int IVA;
	private float PVP;
	
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public int getValue() {
		return Value;
	}
	public void setValue(int value) {
		Value = value;
	}
	public int getIVA() {
		return IVA;
	}
	public void setIVA(int iVA) {
		IVA = iVA;
	}
	public float getPVP() {
		return PVP;
	}
	public void setPVP(float pVP) {
		PVP = pVP;
	}
		
}
