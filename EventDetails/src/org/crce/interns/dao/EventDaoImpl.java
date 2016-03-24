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
	public List<Event_details> viewEvents(Integer months) {
		System.out.println("Month in Dao Impl :" + months);
		List<Event_details> allEvents = entityManager.createQuery("select ed from Event_details ed " + " where EXTRACT(MONTH from ed.dates)= :m").setParameter("m", months).getResultList();
		if (allEvents.isEmpty()) {
			System.out.println("Error null query");
		}
		return allEvents;
	}

}
