package org.crce.interns.dao;

import java.sql.Date;
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
	public List<Event_details> viewEvents(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		List<Event_details> allEvents=entityManager.createQuery("SELECT e FROM Events ed WHERE ed.date BETWEEN :startDate AND :endDate", Event_details.class).setParameter("startDate",startDate).setParameter("endDate",endDate).getResultList();
		return allEvents;
	}

}
