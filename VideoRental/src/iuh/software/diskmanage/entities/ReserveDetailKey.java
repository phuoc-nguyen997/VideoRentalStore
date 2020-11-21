package iuh.software.diskmanage.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ReserveDetailKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1353960910586908108L;

	@Column(name="idCustomer")
	 int CustomerID;
	
	@Column(name="idTitle")
	 int TitleID;

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public int getTitleID() {
		return TitleID;
	}

	public void setTitleID(int titleID) {
		TitleID = titleID;
	}

	public ReserveDetailKey(int customerID, int titleID) {
		super();
		CustomerID = customerID;
		TitleID = titleID;
	}

	public ReserveDetailKey() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CustomerID;
		result = prime * result + TitleID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReserveDetailKey other = (ReserveDetailKey) obj;
		if (CustomerID != other.CustomerID)
			return false;
		if (TitleID != other.TitleID)
			return false;
		return true;
	}

	
	
	

}
