package eTicaretDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import eTicaretDemo.business.abstracts.CheckToNewUser;
import eTicaretDemo.entities.concretes.User;

public class CheckToNewUserManager implements CheckToNewUser{
	List<String> maiList = new ArrayList<>();
	
	@Override
	public  boolean checkMail(User user) {

			if(Pattern.matches("^(.+)@(.+)\\.com$", user.getEmail())) {
				return true;}
			else {
				System.out.println("hatalı mail girişi");
				return false;}
	}

	@Override
	public boolean checkPassword(User user) {
		if(Pattern.matches("^(......+)$", user.getPassword())) return true;
		else {
			System.out.println("hatalı şifre girişi");
			return false;}
	}

	@Override
	public boolean checkFirstName(User user) {
		if(Pattern.matches("^(..+)$", user.getFirstName())) return true;
		else {
			System.out.println("hatalı ad girişi");
			return false;}
	}

	@Override
	public boolean checkLastName(User user) {
		if(Pattern.matches("^(..+)$", user.getLastName())) return true;
		else {
			System.out.println("hatalı soyad girişi");
		return false;}
	}

	@Override
	public boolean controlMail(User user) {
		String mail=user.getEmail();
		
		if(maiList.isEmpty()==true) {
			maiList.add(mail);
			return true;
		}
		else if(maiList.contains(mail) == false) {
			maiList.add(mail);
			return true;
		}
		else {
			System.out.println("hatalı mail girişi");
			return false;}
	}
}
