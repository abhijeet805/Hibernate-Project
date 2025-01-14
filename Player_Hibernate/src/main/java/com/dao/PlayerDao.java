package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import com.config.hibernateConfig;
import com.entity.Player;

public class PlayerDao {

	SessionFactory sf = hibernateConfig.getSessionFactory();

	public String addPlayerData(Player player) {
		Session session = sf.openSession();
		session.save(player);
		session.beginTransaction().commit();

		return "Added Succesfully";

	}

	public List<Player> DisplayPlayer() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		List<Player> list = criteria.list();

		return list;
	}

	public String deleteById(int PlayerId) {
		Session session = sf.openSession();

		Player product = session.get(Player.class, PlayerId); // persistent object
		session.delete(product);
		session.beginTransaction().commit();

		return "delete Succesfully";

	}

	public List<Player> getLimitedData(int key) {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.setMaxResults(key);
		List<Player> list = criteria.list();

		return list;
	}

	public List<Player> getParticularRecord_pagination() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		criteria.setFirstResult(3);
		criteria.setMaxResults(3);
		List<Player> list = criteria.list();

		return list;
	}

	public List<Player> restriction() {
		// Use Restriction when Data is need to print(filterring) & your Input Is
		// another of primary column & Mysql Query Include operator
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		
		// criteria.add(Restrictions.eq("jerseynumber",45)); //select * from players where jersynumber=45; //Restriction working like This Query.

		// criteria.add(Restrictions.gt("totalRuns", 6000)); //select * from players
		// where totalRuns>6000;

		/*
		 * SimpleExpression eqId = Restrictions.eq("id",4); SimpleExpression eqRun =
		 * Restrictions.eq("totalRuns",2300);
		 * criteria.add(Restrictions.and(eqId,eqRun)); //select * from players where
		 * id=4 and totalRuns=2300;
		 */

		SimpleExpression eqId = Restrictions.eq("id", 4);
		SimpleExpression eqRun = Restrictions.eq("totalRuns", 5000);
		criteria.add(Restrictions.or(eqId, eqRun)); // select * from players where id=4 and totalRuns=5000;

		List<Player> list = criteria.list();

		return list;
	}

	public void projection() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Player.class);
		
		//criteria.setProjection(Projections.rowCount());// It Return long
		
		//criteria.setProjection(Projections.max("totalRuns")); //It return int
		
		//criteria.setProjection(Projections.min("totalRuns")); //It return int
		
		//criteria.setProjection(Projections.avg("totalRuns")); //It return double
		
		criteria.setProjection(Projections.sum("totalRuns")); //It return long
		List list = criteria.list();
		
		if(list.isEmpty()) {
			System.out.println(0);
		}
		else {
			long count = (long) list.get(0);
			System.out.println(count);	
		}
		
	}

	public List<Object[]> displaySpecificColumn() {
		
		//This method return Like:-  select id,name from players;
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Player.class);
		
		ProjectionList projectionList=Projections.projectionList();
		projectionList.add(Projections.property("id"));
		projectionList.add(Projections.property("name"));
		
		criteria.setProjection(projectionList);
		List<Object[]> list = criteria.list();
		
		return list;
		
	}
}
