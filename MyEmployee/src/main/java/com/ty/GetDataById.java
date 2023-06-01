                                      package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetDataById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
	   Employee employee= entityManager.find(Employee.class, 5);
	   System.out.println("Employee ID is : "+employee.getId());
	   System.out.println("Employee NAME is : "+employee.getName());
	   System.out.println("Employee AGE is : "+employee.getAge());
	   System.out.println("Employee GENDER is : "+employee.getGender());
	   System.out.println("Employee PANNO is : "+employee.getPanNo());
	   System.out.println("Employee PHNO is : "+employee.getPhno());
	   System.out.println("Employee SALARY is : "+employee.getSal());
		
	}
}
