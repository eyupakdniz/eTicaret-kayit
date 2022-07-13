package eTicaretDemo;


import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.concretes.CheckToNewUserManager;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.core.message.concrete.LoggerManager;
import eTicaretDemo.dataAccess.concretes.BirUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setEmail("osmanyilmaz@asd.com");
		user1.setPassword("asdf51");
		user1.setFirstName("osman");
		user1.setLastName("yılmaz");
		
		User user2 = new User("aliveli@f.com","as2d5!","ali","veli");
		User user3 = new User("aliveli@f.com","jn.5k,","ahmet","cakar");
		

		UserService userService = new UserManager(new BirUserDao(), new CheckToNewUserManager(),new LoggerManager());
		userService.add(user1);
		userService.add(user2);
		userService.add(user3);
		
	}
}