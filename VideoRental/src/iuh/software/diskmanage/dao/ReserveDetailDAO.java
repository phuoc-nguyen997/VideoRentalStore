package iuh.software.diskmanage.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import iuh.software.diskmanage.entities.RentalInfo;
import iuh.software.diskmanage.entities.ReserveDetail;

public class ReserveDetailDAO extends CRUD_Persistence<ReserveDetail> {

	// Tìm kiếm ReserveDatail theo id
	public ReserveDetail findByIdReserveDetail(int id) {
		return em.find(ReserveDetail.class, id);
	}

	// lấy hết các RentalInfo có trong table
	public List<ReserveDetail> getAllReserveDetail() {

		String hql = "FROM ReserveDetail";

		Query query = em.createQuery(hql);

		return query.getResultList();

	}

// lấy RentalInfo theo id của Customer
	public List<ReserveDetail> getReserveDetailByIdCustomer(int idCustomer) {
		List<ReserveDetail> listReserveDetail = this.getAllReserveDetail();

		List<ReserveDetail> resultListReserveDetail = new ArrayList<ReserveDetail>();
		for (ReserveDetail reserveDetail : listReserveDetail) {
			if (reserveDetail.getCustomer().getIdCustomer() == idCustomer) {
				resultListReserveDetail.add(reserveDetail);
			}
		}

		return resultListReserveDetail;
	}

	// lấy RentalInfo theo id của Title
		public List<ReserveDetail> getReserveDetailByIdTitle(int idTitle) {
			List<ReserveDetail> listReserveDetail = this.getAllReserveDetail();

			List<ReserveDetail> resultListReserveDetail = new ArrayList<ReserveDetail>();
			for (ReserveDetail reserveDetail : listReserveDetail) {
				if (reserveDetail.getTitle().getIdTitle()== idTitle) {
					resultListReserveDetail.add(reserveDetail);
				}
			}

			return resultListReserveDetail;
		}
}
