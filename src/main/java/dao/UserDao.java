package dao;

import model.User;

public interface UserDao {

	public int save(User u) throws Exception;
	public boolean findLogInMatch(String email,String password) throws Exception;
}
