package eTicaretDemo.business.abstracts;


import eTicaretDemo.entities.concretes.User;

public interface CheckToNewUser {

	public boolean checkMail(User user);
	public boolean checkPassword(User user);
	public boolean checkFirstName(User user);
	public boolean checkLastName(User user);
	public boolean controlMail(User user);
	
	
}
