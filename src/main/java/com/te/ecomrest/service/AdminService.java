package com.te.ecomrest.service;

import java.util.List;

import com.te.ecomrest.bean.Admin;
import com.te.ecomrest.bean.Item;

public interface AdminService {

	public Admin authenticate(Integer id, String password);
	
	public boolean addItem(Item item);
	
	public boolean removeItem(Integer id);
	
	public Item searchItem(Integer id);
	
	public List<Item> getAllItems();
	
	public boolean updateItem(Item item);

}
