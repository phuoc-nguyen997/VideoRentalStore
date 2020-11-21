package iuh.software.diskmanage.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Title
 *
 */
@Entity
public class Title implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTitle;
	private String titleName;
	private String image_url;
	private String description;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "idTypes")
	private DVDType type;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "title")
	private List<DVD> listDVD;
	
	@OneToMany(mappedBy = "customer")
	private List<ReserveDetail> reserveDetail= new ArrayList<ReserveDetail>();
	
	public Title() {
		super();
	}   
	
	
	public Title(String titleName, String image_url, String description) {
		super();
		this.titleName = titleName;
		this.image_url = image_url;
		this.description = description;
	}


	public int getIdTitle() {
		return this.idTitle;
	}

	public void setIdTitle(int idTitle) {
		this.idTitle = idTitle;
	}   
	public String getTitleName() {
		return this.titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}   
	public String getImage_url() {
		return this.image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public DVDType getType() {
		return type;
	}
	public void setType(DVDType type) {
		this.type = type;
	}
	public List<DVD> getListDVD() {
		return listDVD;
	}
	public void setListDVD(List<DVD> listDVD) {
		this.listDVD = listDVD;
	}


	public List<ReserveDetail> getReserveDetail() {
		return reserveDetail;
	}


	public void setReserveDetail(List<ReserveDetail> reserveDetail) {
		this.reserveDetail = reserveDetail;
	}
	
	
   
}
