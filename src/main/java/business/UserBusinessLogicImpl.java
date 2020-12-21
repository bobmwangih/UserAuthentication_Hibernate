package business;

import dao.UserDao;
import model.User;

public class UserBusinessLogicImpl implements UserBusinessLogic {
	
	private UserDao dao;
	

	public void setDao(UserDao dao) {
		this.dao = dao;
	}


	public void createUser(User u) throws Exception {
		/*
		 * User u =new User(); u.setId(id); u.setEmail(email); u.setPassword(password);
		 * u.setName(name);
		 */
		dao.save(u);
		
	}
	
}
