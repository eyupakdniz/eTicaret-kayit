package eTicaretDemo.core.message.concrete;


import eTicaretDemo.core.message.abstracts.ILogger;
import eTicaretDemo.entities.concretes.User;

public class LoggerManager implements ILogger{

	@Override
	public void message(User user) {
		System.out.println(user.getEmail() + " adresine bilgi mesajı gönderildi");
		
	}



}
