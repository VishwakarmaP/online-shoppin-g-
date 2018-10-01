package net_kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net_kzn.shoppingbackend.dao.CategoryDAO;
import net_kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net_kzn.shoppingbackend");
		context.refresh();
		
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	/*@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some discription for television");
		category.setImageURL("CAT_1.png");
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
	}*/
	
	/*@Test
	public void testGetCategory() {
		
		category = categoryDAO.get(1);
		
		assertEquals("Successfully added a category inside the table!","Television",category.getName());
		
		
	}*/

	/*@Test
	public void testUpdateCategory() {
		
		category = categoryDAO.get(1);
		
		category.setName("TV");
		
		assertEquals("Successfully update a category inside the table!",true,categoryDAO.update(category));
		
		
	}*/

	/*@Test
	public void testDeleteCategory() {
		
		category = categoryDAO.get(1);
		
		assertEquals("Successfully deleted a category inside the table!",true,categoryDAO.delete(category));
		
		
	}*/

	/*
	@Test
	public void testListCategory() {
		
		assertEquals("Successfully fatched the list category inside the table!",1,categoryDAO.list().size());
		
		
	}*/

	@Test
	public void testCRUDCategry() {
category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some discription for television");
		category.setImageURL("CAT_1.png");
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some discription for television");
		category.setImageURL("CAT_1.png");
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		//fetching and updating the categry
		
category = categoryDAO.get(1);
		
		category.setName("TV");
		
		assertEquals("Successfully update a category inside the table!",true,categoryDAO.update(category));
		
	}

}
