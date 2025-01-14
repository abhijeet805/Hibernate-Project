package HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.config.hibernateConfig;
import com.entity.Player;

public class AllDataByHql {
  public static void main(String[] args) {
	SessionFactory sf=hibernateConfig.getSessionFactory();
	Session session=sf.openSession();
	
	Query<Player> query = session.createQuery("from Player");
	
	List<Player> list=query.list();
	
	for (Player player : list) {
		System.out.println(player);
	}
}
}
