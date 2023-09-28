package com.example.service;


import java.util.List;

import com.example.entities.Items;

public interface ItemsService {

	

	Items createItems(Items items);

	List<Items>itemList();

	 Items getItem(int id);

	Items updateItem(Items items);

	void deleteItem(int id);
	
	
	
}
