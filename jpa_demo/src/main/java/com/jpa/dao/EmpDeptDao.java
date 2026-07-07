package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.entity.Customer;
import com.jpa.entity.Department;
import com.jpa.entity.Employee;

public class EmpDeptDao 
{
	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("MyJpa");
	}
	
	public Department saveDept(Department d)
	{
		EntityManager mgr=emf.createEntityManager();
		EntityTransaction txn=mgr.getTransaction();
		
		txn.begin();
		mgr.persist(d);
		txn.commit();
		
		return d;
	}
	public Employee saveEmp(Employee e,int deptNo)
	{
		EntityManager mgr=emf.createEntityManager();
		EntityTransaction txn=mgr.getTransaction();
		
		txn.begin();
		Department d=mgr.find(Department.class, deptNo);
		e.setDept(d);
		mgr.persist(e);
		txn.commit();
		
		return e;
		
	}
	
	public Employee findEmp(int empId) {

		EntityManager mgr = emf.createEntityManager();
		try {
			return mgr.find(Employee.class, empId);
		} finally {
			mgr.close();
		}
	}
	
	public Department findDept(int deptId) {

	    EntityManager mgr = emf.createEntityManager();
	    try {
	        Department d = mgr.find(Department.class, deptId);

	        d.getEmps().size();   // Load employees while session is open

	        return d;
	    } finally {
	        mgr.close();
	    }
	}

	public List<Employee> list() {

		EntityManager mgr = emf.createEntityManager();
		try {
			Query query = mgr.createQuery("FROM emp");
			return query.getResultList();
		} finally {
			mgr.close();
		}
	}

	public boolean deleteDept(int deptId) {

		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		
			txn.begin();
			Department d = mgr.find(Department.class, deptId);
			mgr.remove(d);
			txn.commit();
			return true;
	}
	
}
