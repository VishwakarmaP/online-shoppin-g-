package net_kzn.shoppingbackend.dao;

import java.util.List;

import net_kzn.shoppingbackend.dto.Category;

public interface CategoryDAO {


	boolean add(Category category);
	
	List<Category> list();
	Category get(int id);
}
