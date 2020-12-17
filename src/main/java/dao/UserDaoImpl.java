package dao;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDaoImpl implements UserDao{
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
	public int save(User u) throws Exception {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save()
		return 0;
	}

	public boolean findLogInMatch(String email, String password) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	
}
