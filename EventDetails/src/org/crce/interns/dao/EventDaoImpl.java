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
	public List<Event_details> viewEvents(String months) {
		// TODO Auto-generated method stub
		/*List<Event_details> allEvents=entityManager.createQuery("SELECT ed FROM Events ed WHERE ed.date BETWEEN :startDate AND :endDate", Event_details.class).setParameter("startDate",startDate).setParameter("endDate",endDate).getResultList();
		return allEvents;*/
		int foo = Integer.parseInt(months);
		System.out.println("Month in Dao Impl :"+months);
		//List<Event_details> allEvents=entityManager.createQuery("select ed from Event_details ed where EXTRACT(MONTH FROM(ed.dates, 'yyyy/mm/dd'))= :m").setParameter("m", months).getResultList();
		List<Event_details> allEvents=entityManager.createQuery("select ed from Event_details ed "+" where EXTRACT(MONTH from ed.dates)= :m").setParameter("m", foo).getResultList();
		//List<Event_details> allEvents=entityManager.createQuery("select ed from Event_details ed").getResultList();/*FUNC('MONTH', c_Date)*/
		
		if(allEvents.isEmpty())
		 {
			 System.out.println("Error null query");
		 }
		 return allEvents;
	}

}
