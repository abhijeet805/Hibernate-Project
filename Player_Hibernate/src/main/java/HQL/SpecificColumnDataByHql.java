package HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.config.hibernateConfig;
import com.entity.Player;

public class SpecificColumnDataByHql {

	public static void main(String[] args) {
		SessionFactory sf=hibernateConfig.getSessionFactory();
		Session session=sf.openSession();
		
		/*//It is for the multiple column Record
		 * Query<Object[]> query = session.createQuery("select name,id from Player");
		 * 
		 * List<Object[]> list=query.list();
		 * 
		 * for (Object[] Ob : list) { System.out.println(Ob[0]+"\t"+Ob[1]); }
		 */
		
		//It is for the one column Record
        Query<String> query = session.createQuery("select name from Player");
		
		List<String> list=query.list();
		
		for (String s1 : list) {
			System.out.println(s1+"\t");
		}
		
	}

}
