package io.altar.repository;

//import java.util.Collection;
//import java.util.LinkedHashMap;
//import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import io.altar.model.EntityModel;


public abstract class EntityRepository <E extends EntityModel> {
	
	@PersistenceContext(unitName="Repository")
	private EntityManager entitymanager;
	
	@Transactional
	public EntityManager getDataBase(){
		return entitymanager;
	}
	
	@Transactional
	public void PutOnDataBase(E entity){
		entitymanager.persist(entity);
	}
	@Transactional
	public void RemoveFromDataBase (E entity){
		entitymanager.remove(entity);
	}
	@Transactional
	public void Edit(E entity){
		entitymanager.merge(entity);
	}
//	private LinkedHashMap <Integer, E> Entities = new LinkedHashMap <> ();
//	
//	private static int productId = 0;
//	
//	public static int productNextId(){
//		return ++productId;
//	}
//		
//	public void PutOnListProduct(E Product){
//		Product.setId(productNextId());
//		System.out.println(Product);
//		Entities.put(Product.getId(), Product);
//	}
//	
//	private static int shelfId = 0;
//	
//	public static int shelfNextId(){
//		return ++shelfId;
//	}
//		
//	public void PutOnListShelf(E Shelf){
//		Shelf.setId(shelfNextId());
//		Entities.put(Shelf.getId(), Shelf);
//	}
//	
//	public Set<Integer> keySet(){
//		return Entities.keySet();
//	}
//	public EntityModel get(Integer key){
//		return Entities.get(key);
//	}
//	
//	public boolean isEmpty(){
//		return Entities.isEmpty();
//	}
//	
//	public boolean ProductcontainsKey(int Id){
//		return Entities.containsKey(Id);
//	}
//	
//	public boolean ShelfcontainsKey(int Id){
//		return Entities.containsKey(Id);
//	}
//
//	public EntityModel remove(int Id){
//		return Entities.remove(Id);
//	}
//	
//	public Collection<E> getall(){
//		return Entities.values();
//	}
//	
}