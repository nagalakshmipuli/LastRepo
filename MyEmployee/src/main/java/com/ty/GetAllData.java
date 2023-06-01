package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
	Query query=entityManager.createQuery("select e from Employee e where phno=?1 and age>=?2");
	query.setParameter(1,9987628656l);
	query.setParameter(2, 20);
	List<Employee> employees=query.getResultList();
	for (Employee employee : employees) {
		
	System.out.println("Employee ID is : "+employee.getId());
	   System.out.println("Employee NAME is : "+employee.getName());
	   System.out.println("Employee AGE is : "+employee.getAge());
	   System.out.println("Employee GENDER is : "+employee.getGender());
	   System.out.println("Employee PANNO is : "+employee.getPanNo());
	   System.out.println("Employee PHNO is : "+employee.getPhno());
	   System.out.println("Employee SALARY is : "+employee.getSal());
	   System.out.println("========================================");
	}
}
}