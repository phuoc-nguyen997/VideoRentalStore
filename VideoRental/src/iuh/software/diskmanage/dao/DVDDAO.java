package iuh.software.diskmanage.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import iuh.software.diskmanage.entities.DVD;

public class DVDDAO extends CRUD_Persistence<DVD> {
	// lay DVD theo id
	public DVD findByIdDVD(int id) {
		return em.find(DVD.class, id);
	}

// lay tat ca cac DVD co trong table
	public List<DVD> getAllDVD() {

		String hql = "FROM DVD";

		Query query = em.createQuery(hql);

		return query.getResultList();

	}

// lay DVD theo id cua Title
	public List<DVD> getDVDByIdTitle(int idTitle) {
		List<DVD> listDVD = this.getAllDVD();

		List<DVD> resultListDVD = new ArrayList<DVD>();

		for (DVD dvd : listDVD) {
			if (dvd.getTitle().getIdTitle() == idTitle) {
				resultListDVD.add(dvd);
			}
		}
		return resultListDVD;

	}
}
