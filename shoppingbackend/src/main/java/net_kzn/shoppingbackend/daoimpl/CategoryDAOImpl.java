package net_kzn.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net_kzn.shoppingbackend.dao.CategoryDAO;
import net_kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Category> list() {
		
		String selectActiveCategory = "from Category where active = :active";
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", true);
		
		return query.getResultList();
	}

	/*
	 * Getting single category based on id
	 */
	@Override
	public Category get(int id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Category category) {


		try {
			// add the category to the database
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

	/*
	 * Updateing a single category
	 */
	@Override
	public boolean update(Category category) {
		// update the category to the database
		try {
			// add the category to the database
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

	/*
	 * Deleting a single category
	 */
	@Override
	public boolean delete(Category category) {
		
		category.setActive(false);
		try {
			// add the category to the database
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
