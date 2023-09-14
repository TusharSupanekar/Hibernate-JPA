package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("tushar");

		EntityManager entityManager =
				entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction =
				entityManager.getTransaction();

		Employee employee = new Employee();
		employee.setName("Tushar");
		employee.setEmail("tush@mail.com");
		employee.setCno(9856478834l);

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

	}
	

}
