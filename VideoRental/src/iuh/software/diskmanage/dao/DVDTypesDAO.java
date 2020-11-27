package iuh.software.diskmanage.dao;

import java.util.List;

import javax.persistence.Query;

import iuh.software.diskmanage.entities.DVDType;

public class DVDTypesDAO extends CRUD_Persistence<DVDType>{
	public List<DVDType> getALLTypes(){
		String hql=" from DVDType";
		Query query= em.createQuery(hql);
		return query.getResultList();
	}
	
	public DVDType findByIdType(int idType) {
		return em.find(DVDType.class, idType);
	}
	

}
