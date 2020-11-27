package iuh.software.diskmanage.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: DVD
 *
 */
@Entity
public class DVD implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDVD;
	
	private Date createDate;
	
	@Enumerated
	private DVDStatus status;
	
	@ManyToOne
	@JoinColumn(name = "idTitle")
	private Title title;
	
	// mappedBy trỏ tới tên biến dvd ở trong RentalInfo.
    @ManyToMany(mappedBy = "listDVD")
    private List<RentalInfo> listRentalInfo = new ArrayList<RentalInfo>();
	
	private static final long serialVersionUID = 1L;

	public DVD() {
		super();
	}   
	
	public DVD(Date createDate, DVDStatus status, Title title) {
		super();
		this.createDate = createDate;
		this.status = status;
		this.title = title;
	}


	public int getIdDVD() {
		return this.idDVD;
	}

	public void setIdDVD(int idDVD) {
		this.idDVD = idDVD;
	}   
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}   
	public DVDStatus getStatus() {
		return this.status;
	}

	public void setStatus(DVDStatus status) {
		this.status = status;
	}
	
	public enum DVDStatus{
		RENTED,
		AVAILABLE,
		ONHOLD
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public List<RentalInfo> getListRentalInfo() {
		return listRentalInfo;
	}

	public void setListRentalInfo(List<RentalInfo> listRentalInfo) {
		this.listRentalInfo = listRentalInfo;
	}

	public DVD(Date createDate, DVDStatus status) {
		super();
		this.createDate = createDate;
		this.status = status;
	}

	public DVD(Date date, int i) {
		// TODO Auto-generated constructor stub
	}


	
	
   
}
