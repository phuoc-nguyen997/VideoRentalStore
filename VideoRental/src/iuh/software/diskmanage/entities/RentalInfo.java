package iuh.software.diskmanage.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: RentalInfo
 *
 */
@Entity
public class RentalInfo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRentalInfo;
	private Date startDate;
	private Date returnDate;
	private double rentalFee;
	private double lateCharge;
	private double total; // rentalfee + latecharge
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name ="idCustomer")
	private Customer customer;
	
	 @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinTable(name = "RentalDetail", //Tạo ra một join Table tên là "rentaldetail"
	            joinColumns = @JoinColumn(name = "idRentalInfo"),  // TRong đó, khóa ngoại chính là idRentalInfo trỏ tới class hiện tại (RentalInfo)
	            inverseJoinColumns = @JoinColumn(name = "idDVD") //Khóa ngoại thứ 2 trỏ tới thuộc tính ở dưới (DVD)
	    )
	 
	    private List<DVD> listDVD = new ArrayList<DVD>();
	
	public RentalInfo() {
		super();
	}   
	

	public double getRentalFee() {
		return rentalFee;
	}


	public void setRentalFee(double rentalFee) {
		this.rentalFee = rentalFee;
	}


	public double getLateCharge() {
		return lateCharge;
	}


	public void setLateCharge(double lateCharge) {
		this.lateCharge = lateCharge;
	}


	public int getIdRentalInfo() {
		return this.idRentalInfo;
	}

	public void setIdRentalInfo(int idRentalInfo) {
		this.idRentalInfo = idRentalInfo;
	}   
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}   
	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}


	public List<DVD> getListDVD() {
		return listDVD;
	}


	public void setListDVD(List<DVD> listDVD) {
		this.listDVD = listDVD;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public RentalInfo(Date startDate, Date returnDate, double rentalFee, double lateCharge, double total) {
		super();
		this.startDate = startDate;
		this.returnDate = returnDate;
		this.rentalFee = rentalFee;
		this.lateCharge = lateCharge;
		this.total = total;
	}


	
   
}
