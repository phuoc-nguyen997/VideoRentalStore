package iuh.software.diskmanage.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity
public class Customer implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCustomer;
	private String customerName;
	private String phone;
	private String mail;
	private String address;
	private static final long serialVersionUID = 1L;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
	private List<RentalInfo> listRental;
	
	@OneToMany(mappedBy = "customer")
	private List<ReserveDetail> reserveDetail= new ArrayList<ReserveDetail>();
	
	public Customer() {
		super();
	}   
	public int getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}   
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}   
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}   
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public List<RentalInfo> getListRental() {
		return listRental;
	}
	public void setListRental(List<RentalInfo> listRental) {
		this.listRental = listRental;
	}
	public List<ReserveDetail> getReserveDetail() {
		return reserveDetail;
	}
	public void setReserveDetail(List<ReserveDetail> reserveDetail) {
		this.reserveDetail = reserveDetail;
	}
	public Customer(String customerName, String phone, String mail, String address) {
		super();
		this.customerName = customerName;
		this.phone = phone;
		this.mail = mail;
		this.address = address;
	}
	
   
}
