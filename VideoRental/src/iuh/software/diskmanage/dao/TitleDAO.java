package iuh.software.diskmanage.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import iuh.software.diskmanage.entities.Title;

public class TitleDAO extends CRUD_Persistence<Title> {
	public Title findById(int id) {
		return em.find(Title.class, id);
	}

	public List<Title> getAllTitle() {

		String hql = "FROM Title";

		Query query = em.createQuery(hql);

		return query.getResultList();

	}

	public List<Title> getTitleByIdType(int idType) {
		List<Title> listTitle = this.getAllTitle();

		List<Title> resultListTitle = new ArrayList<Title>();

		for (Title title : listTitle) {
			if (title.getType().getIdType() == idType) {
				resultListTitle.add(title);
			}
		}

		return resultListTitle;
	}

}
