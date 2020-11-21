package iuh.software.diskmanage.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em;
		em= Persistence.createEntityManagerFactory("VideoRental").createEntityManager();
		em.close();
	}

}
