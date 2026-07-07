package com.jpa.test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jpa.dao.EmpDeptDao;
import com.jpa.entity.Department;
import com.jpa.entity.Employee;

public class TestEmpDeptDao 
{
	private static EmpDeptDao dao;
	
	@BeforeAll
	public static void init()
	{
		dao=new EmpDeptDao();
	}
	
	@Test
	public void testSaveEmp()
	{
		Employee e=new Employee(1,"Jayesh","HR",20000);
		
		assertNotNull(dao.saveEmp(e,1));
	}
	
	@Test
	public void testSaveDept()
	{
		Department d=new Department(1,"HR","Pune");
		
		assertNotNull(dao.saveDept(d));
	}
	@Test
	public void testSaveDeptWithEmp()
	{
		
		Department d=new Department(2,"Marketing","Pune");
		
		Employee e1=new Employee(2,"Mike","Manager",80000);
		Employee e2=new Employee(3,"Aniket","Clerk",20000);
		
		e1.setDept(d);
		e2.setDept(d);
		
		d.getEmps().add(e1);
		d.getEmps().add(e2);
		
		assertNotNull(dao.saveDept(d));
	}
	@Test
	public void testFindEmp()
	{
		Employee e= dao.findEmp(1);
		assertNotNull(e);
		System.out.println(e);
		
		Department d=e.getDept();
		System.out.println(d);
	}
	
	@Test
	public void testFindDept()
	{
		Department d= dao.findDept(1);
		System.out.println(d);
		assertNotNull(d);
		
		List<Employee> emps=d.getEmps();
		emps.forEach(System.out::println);
	}
	
	
	@Test
	public void testList()
	{
		List<Employee> emps=dao.list();
		assertFalse(emps.isEmpty());
		emps.forEach(System.out::println);
		
	}
	
	@Test
	public void testDeleteDept()
	{
		assertTrue(dao.deleteDept(3));
	}
	
}