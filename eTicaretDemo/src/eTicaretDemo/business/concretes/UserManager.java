package eTicaretDemo.business.concretes;

import java.util.List;
import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.core.message.abstracts.ILogger;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private CheckToNewUserManager checkToNewUserManager;
	private ILogger iLogger;
	

	public UserManager(UserDao userDao, CheckToNewUserManager checkToNewUserManager, ILogger iLogger) {
		this.userDao = userDao;
		this.checkToNewUserManager = checkToNewUserManager;
		this.iLogger = iLogger;
	}

	@Override
	public void add(User user) {
		
		if(checkToNewUserManager.checkMail(user)&&checkToNewUserManager.checkPassword(user)&&checkToNewUserManager.checkFirstName(user)
						&&checkToNewUserManager.checkLastName(user)&&checkToNewUserManager.controlMail(user)) {
			userDao.add(user);
			iLogger.message(user);}
					
		else System.out.println("hatalı giriş yaptınız");
				}
	
		
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkAll(User user) {

	}

	@Override
	public List<User> getAll() {
		return null;
	}
}
