package iuh.software.diskmanage.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import iuh.software.diskmanage.entities.RentalInfo;


public class RentalInfoDAO extends CRUD_Persistence<RentalInfo>{
	
	// Tìm kiếm RentalInfo theo id
	public RentalInfo findByIdRentalInfo(int id) {
		return em.find(RentalInfo.class, id);
	}

	// lấy hết các RentalInfo có trong table
	public List<RentalInfo> getAllRentalInfo() {

		String hql = "FROM RentalInfo";

		Query query = em.createQuery(hql);

		return query.getResultList();

	}
// lấy RentalInfo theo id của Customer
	public List<RentalInfo> getRentalInfoByIdCustomer(int idCustomer) {
		List<RentalInfo> listRentalInfo = this.getAllRentalInfo();

		List<RentalInfo> resultListRentalInfo = new ArrayList<RentalInfo>();

		for (RentalInfo rentalInfo : listRentalInfo) {
			if (rentalInfo.getCustomer().getIdCustomer() == idCustomer) {
				resultListRentalInfo.add(rentalInfo);
			}
		}

		return resultListRentalInfo;
	}
	

}
