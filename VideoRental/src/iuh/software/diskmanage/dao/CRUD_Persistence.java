package iuh.software.diskmanage.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class CRUD_Persistence <T>{

	protected EntityManager em;
	
	public CRUD_Persistence() {
		// TODO Auto-generated constructor stub
		em = Persistence.createEntityManagerFactory("VideoRental").createEntityManager();
	}
	
	public boolean save(T t) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(t);
			tr.commit();
			return true;
		}catch(Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}
	public boolean update(T t) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(t);
			tr.commit();
			return true;
		}catch(Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}
	public boolean delete(T t) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove(t);
			tr.commit();
			return true;
		}catch(Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}
}
