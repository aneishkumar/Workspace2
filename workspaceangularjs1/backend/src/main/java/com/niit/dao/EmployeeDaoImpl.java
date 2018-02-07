package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Employee;
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	SessionFactory sessionFactory;

	public List<Employee> getAllEmployees() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from employee");
		List<Employee> employee=query.list();
		return employee;
		
		
	}

	public void addEmployee(Employee employee) 
	{
		
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.save(employee);
		trans.commit();
		session.flush();
		session.close();
	}

}

