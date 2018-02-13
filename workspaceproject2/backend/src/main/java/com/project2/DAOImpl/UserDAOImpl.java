package com.project2.DAOImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.UserDAO;
import com.project2.model.User;
@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		
	}

}
