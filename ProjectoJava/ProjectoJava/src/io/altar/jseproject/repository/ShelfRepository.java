package io.altar.jseproject.repository;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import io.altar.jseproject.model.Shelf;

public class ShelfRepository {
	
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
}