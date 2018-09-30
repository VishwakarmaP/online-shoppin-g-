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
	
	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some discription for television");
		category.setImageURL("CAT_1.png");
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
	}
}
