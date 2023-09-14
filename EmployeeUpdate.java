package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("tushar");

		EntityManager entityManager =
				entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction =
				entityManager.getTransaction();

		Employee employee = entityManager.find(Employee.class, 2);
		employee.setEmail("aditya@mail.com");

		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();

		System.out.println(employee.getId());
		System.out.println(employee.getEmail());

	}
	
}
