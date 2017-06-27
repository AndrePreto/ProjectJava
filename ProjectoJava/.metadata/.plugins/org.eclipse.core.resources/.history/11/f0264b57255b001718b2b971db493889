package io.altar.repository;

import io.altar.model.Shelf;

public class ShelfRepository extends EntityRepository <Shelf> {
	
//	private static final ShelfRepository INSTANCE = new ShelfRepository();
	
	public ShelfRepository(){}
	
//	public static ShelfRepository getInstance(){
//		return INSTANCE;
//	}
	
	public void editShelf (int Id, int code, int capacity, double price){
		
		((Shelf) get(Id)).setCode(code);
		((Shelf) get(Id)).setCapacity(capacity);
		((Shelf) get(Id)).setPrice(price);
	}
	
	public void editShelfCode (int Id, int code){
		
		((Shelf) get(Id)).setCode(code);
	}
	
	public void editShelfCapacity (int Id, int capacity){
		
		((Shelf) get(Id)).setCapacity(capacity);
	}
	
	public void editShelfPrice (int Id, double price){
		
		((Shelf) get(Id)).setPrice(price);
	}
	/*
	//Com arrayList
	//public static ArrayList<Shelf> Shelfs = new ArrayList<Shelf> ();
	
	public static LinkedHashMap<Integer, Shelf> Shelfs = new LinkedHashMap<Integer, Shelf>();
	
	public static void ShelfList(){
		
		if(Shelfs.isEmpty()){
			System.out.println("Não existe nenhuma prateleira de momento");
		}else{
			System.out.println("Tem as seguintes prateleiras");
			
			for (Entry<Integer, Shelf> entry : Shelfs.entrySet()) {
				System.out.println(entry.getValue());
			
			//Com arrayList
			//System.out.println(Arrays.toString(Products.toArray()));
			}
		}
	}
	*/
}