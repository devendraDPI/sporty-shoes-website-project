package com.ecommerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ecommerce.entity.Purchase; 

@Repository
@Component
public class PurchaseDAO {

	@Autowired
    private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public Purchase getPurchaseById(long id) {
		String strId = String.valueOf(id);
		List<Purchase> list = this.sessionFactory.getCurrentSession().createQuery("from Purchase where id=" + strId).list();
		if (list.size() > 0)
			return (Purchase) list.get(0);
		else
			return null;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Purchase> getAllItems() {
		List<Purchase> list = this.sessionFactory.getCurrentSession().createQuery("from Purchase order by ID desc").list();
		return list;
	}	
		
	@SuppressWarnings("unchecked")
	public List<Purchase> getAllItemsByUserId(long userId) {
		String strId = String.valueOf(userId);
		List<Purchase> list = this.sessionFactory.getCurrentSession().createQuery("from Purchase where user_id=" + strId + " order by ID desc").list();
		return list;
	}	
	
	@SuppressWarnings("unchecked")
	public long  updatePurchase(Purchase purchase) {
		String sql = "";
		long newId = 0;
		if (purchase.getID() == 0) {
			this.sessionFactory.getCurrentSession().save(purchase);
			newId = purchase.getID();
		} else {
			Query query = this.sessionFactory.getCurrentSession().createQuery(sql);
			query.setParameter("user_id", purchase.getUserId());
			query.setParameter("gross_total", purchase.getTotal());
			
			query.executeUpdate();
		}
		return newId;
	}
	
}