package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.example.entities.Items;
import com.example.service.ItemsService;

@RestController

public class ItemsController {
	
	@Autowired
	ItemsService itemservice;
	
	@PostMapping("/api/createItems")
	Items createItems(@RequestBody Items items) {
		
		return itemservice.createItems(items);
		
}
	@GetMapping("listItems")
	public List<Items>createItemList(){
		
		return itemservice.itemList();
		
	}
	
	@GetMapping("getItems/{id}")
	public Items getNewItem(@PathVariable int id){
		
		return itemservice.getItem(id);
		
	}
	
	
	@PutMapping("updateItems/{id}")
	public Items updateNewItem (@PathVariable int id, @RequestBody Items items){
		
		Items item = itemservice.getItem(id);
		if(item!=null) {
			items.setId(id);
			return itemservice.updateItem(items);
			
		}
		return itemservice.createItems(items);
		
		
	}
	

	@DeleteMapping("deleteItems/{id}")
	public void deleteNewItem(@PathVariable int id){
		
		 itemservice.deleteItem(id);
		
	}
	
	
}