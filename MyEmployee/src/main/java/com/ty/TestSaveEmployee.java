package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveEmployee {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=new Employee();
		employee.setName("kavya");
		employee.setAge(23);
		employee.setGender("female");
		employee.setPanNo("TERED1864T");
		employee.setPhno(9787627856l);
		employee.setSal(55000.00);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

}
