package org.crce.interns.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.crce.interns.model.Event_details;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EventDaoImpl implements EventDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Event_details> viewUsers() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select ed from Event_details ed", Event_details.class).getResultList();
	}

}
