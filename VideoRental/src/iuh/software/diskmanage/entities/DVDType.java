package iuh.software.diskmanage.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: DVDType
 *
 */
@Entity
public class DVDType implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idType;
	private String nameType;
	private int rentalPeriod;
	private double price;
	private double fine;
	private static final long serialVersionUID = 1L;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "type")
	private List<Title> dsTitle;
	
	public DVDType() {
		super();
	}   
	
	public DVDType(String nameType, int rentalPeriod, double price, double fine) {
		super();
		this.nameType = nameType;
		this.rentalPeriod = rentalPeriod;
		this.price = price;
		this.fine = fine;
	}

	public int getIdType() {
		return this.idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}   
	public String getNameType() {
		return this.nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}   
	public int getRentalPeriod() {
		return this.rentalPeriod;
	}

	public void setRentalPeriod(int rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}   
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}   
	public double getFine() {
		return this.fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}
	public List<Title> getDsTitle() {
		return dsTitle;
	}
	public void setDsTitle(List<Title> dsTitle) {
		this.dsTitle = dsTitle;
	}
	
   
}
