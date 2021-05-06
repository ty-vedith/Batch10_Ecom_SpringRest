package com.te.ecomrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ecomrest.bean.Admin;
import com.te.ecomrest.bean.Item;
import com.te.ecomrest.dao.AdminDaoImpl;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDaoImpl adminDao;
	
	
	@Override
	public Admin authenticate(Integer id, String password) {
		Admin admin = adminDao.authenticate(id, password);
		return admin;
	}

	@Override
	public boolean addItem(Item item) {
		boolean result = adminDao.addItem(item) ;
		return result;
	}

	@Override
	public boolean removeItem(Integer id) {
		boolean result = adminDao.removeItem(id);
		return result;
	}

	@Override
	public Item searchItem(Integer id) {
		Item item = adminDao.searchItem(id);
		return item;
	}

	@Override
	public List<Item> getAllItems() {
		List<Item> list = adminDao.getAllItems();
		return list;
	}

	@Override
	public boolean updateItem(Item item) {
		boolean result = adminDao.updateItem(item);
		return result;
	}

}
