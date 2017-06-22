package io.altar.repository;

import io.altar.model.Shelf;

public class ShelfRepository extends EntityRepository <Shelf> {
	
	private static final ShelfRepository INSTANCE = new ShelfRepository();
	
	private ShelfRepository(){}
	
	public static ShelfRepository getInstance(){
		return INSTANCE;
	}
	
	public static void editShelf (int Id, int code, int capacity, double price){
		
		((Shelf)ShelfRepository.getInstance().get(Id)).setCode(code);
		((Shelf)ShelfRepository.getInstance().get(Id)).setCapacity(capacity);
		((Shelf)ShelfRepository.getInstance().get(Id)).setPrice(price);
	}
	
	public static void editShelfCode (int Id, int code){
		
		((Shelf)ShelfRepository.getInstance().get(Id)).setCode(code);
	}
	
	public static void editShelfCapacity (int Id, int capacity){
		
		((Shelf)ShelfRepository.getInstance().get(Id)).setCapacity(capacity);
	}
	
	public static void editShelfPrice (int Id, double price){
		
		((Shelf)ShelfRepository.getInstance().get(Id)).setPrice(price);
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