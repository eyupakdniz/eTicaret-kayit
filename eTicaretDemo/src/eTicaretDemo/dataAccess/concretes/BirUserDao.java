package eTicaretDemo.dataAccess.concretes;


import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;


public class BirUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " eklendi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() +  " silindi");
		
	}
}
