package iuh.software.diskmanage.dao;

import java.util.List;

import javax.persistence.Query;

import iuh.software.diskmanage.entities.Customer;

public class CustomerDAO extends CRUD_Persistence<Customer>{

	public List<Customer> getALLCustomer(){
		String hql=" from Customer";
		Query query= em.createQuery(hql);
		return query.getResultList();
	}
	
	public Customer findById(int idCustomer) {
		return em.find(Customer.class, idCustomer);
	}
	
	
}
