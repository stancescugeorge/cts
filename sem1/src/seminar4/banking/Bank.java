package seminar4.banking;

import java.util.Random;

public class Bank { //clasa folosita pentru FACTORY, va crea conturi bancare (o facem si singleton)
	private static Bank INSTANCE;
	
	private NotificationService emailNotificationService;
	private NotificationService smsNotificationService;
	
	
	private Bank() {
		emailNotificationService= new EmailNotificationService(); // devin inutile pt metoda openDebitAccount
		smsNotificationService = new SMSNotificationService();
	}
	
	public static synchronized Bank getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Bank();
		}
		
		return INSTANCE;
	}
	
	public DebitBankAccount openDebitAccount(Person holder) {
		DebitBankAccount account;
		if(holder.getAge()>18) {
			account = new FeeBankAccount(
					holder.getNotificationType().getNotificationService(),
					generateIban(), holder);
			} 
		else {
			account = new DebitBankAccount(
					holder.getNotificationType().getNotificationService(),
					generateIban(), holder);
		}
		
		return account;
	}
	
	private String generateIban() {
		return "INGB"+System.currentTimeMillis(); //generare iban unic )) - nu functioneaza pentru conturi generate imediat succesiv
	}
}
