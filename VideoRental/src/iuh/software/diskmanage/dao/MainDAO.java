package iuh.software.diskmanage.dao;

import iuh.software.diskmanage.entities.Customer;

public class MainDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  CustomerDAO customerDAO = new CustomerDAO();
		  
		  
		  Customer customer = new Customer("PhuocNguyen","0979682796","phuocnguyen164@gmail.com","Gia lai");
		  
		  customerDAO.save(customer);
		  
		 
		  
	}

}
