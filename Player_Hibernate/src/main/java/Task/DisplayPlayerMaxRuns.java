package Task;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.config.hibernateConfig;
import com.entity.Player;

public class DisplayPlayerMaxRuns {
	public static void main(String[] args) {
	SessionFactory sf=hibernateConfig.getSessionFactory();
	
	Session session=sf.openSession();
	Criteria criteria=session.createCriteria(Player.class);
	
	criteria.setProjection(Projections.max("totalRuns"));
	
	List<Integer> list=criteria.list();
	
	if(list.isEmpty()) { //It use only when list is Empty. If List is Empty and we use get(0) method Then It Throw The Exception 
		System.out.println(0);
	}
	else {
		int count = list.get(0);
		System.out.println(count);	
		Criteria criteria2=session.createCriteria(Player.class);
		
		criteria2.add(Restrictions.eq("totalRuns", count));
		
		List<Player> player=criteria2.list();
		
		for (Player player2 : player) {
			System.out.println(player2);
		}
	}
}
}
