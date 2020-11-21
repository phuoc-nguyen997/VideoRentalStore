package iuh.software.diskmanage.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ReserveDetail
 *
 */
@Entity

public class ReserveDetail implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReserveDetailKey id= new ReserveDetailKey();
	
	@ManyToOne
	@MapsId("CustomerID")
	@JoinColumn(name = "idCustomer")
	Customer customer;
	
	@ManyToOne
	@MapsId("TitleID")
	@JoinColumn(name = "idTitle")
	Title title;
	
	Date reserveDate;
	
	public ReserveDetail() {
		super();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Date getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}

	public ReserveDetail(Customer customer, Title title, Date reserveDate) {
		super();
		this.customer = customer;
		this.title = title;
		this.reserveDate = reserveDate;
	}
	
   
}
