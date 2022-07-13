package eTicaretDemo.dataAccess.abstracts;


import eTicaretDemo.entities.concretes.User;

public interface UserDao {
	public void add(User user);
	public void update(User user);
	public void delete(User user);

	
	

}
