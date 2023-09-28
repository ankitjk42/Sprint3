package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entities.Items;
import com.example.repository.ItemsRepo;
import com.example.service.ItemsService;

@Service
public class ItemsServiceimpl implements ItemsService {
	@Autowired
	ItemsRepo itemrepo;

	
	

	
	public Items createItems(Items items) {
		
		return itemrepo.save(items);
	}




	
	public List<Items>itemList() {
		
		return itemrepo.findAll();
	}





	
	public Items getItem(int id) {
		
		return itemrepo.findById(id).orElse(null);
	}





	
	public Items updateItem(Items items) {
		
		return itemrepo.save(items);
	}





	
	public void deleteItem(int id) {
	
		itemrepo.deleteById(id);
	}
	
	
	
	

	

}
