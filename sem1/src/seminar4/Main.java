package seminar4;

import java.math.BigInteger;
import java.util.Random;

import seminar4.banking.*;
import seminar4.singleton.Elvis;
import seminar4.singleton.ElvisV2;

public class Main {

	public static void main(String[] args) {
		NotificationService emailService = new EmailNotificationService();
		
		Person p3=new Person("Van Damme");
		p3.setEmail("van@damme.com");
		p3.setMobile("+4234230425");
		
		CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance(emailService, "INGB24324324", p3, 100);
		
		CreditBankAccount b1=CreditBankAccount.createCreditBankAccount(emailService, "RFZ456456456", p3); 
		//tehnica de evitare a constructorilor cu diferiti param
		
		BigInteger bi = new BigInteger(24,11,new Random());
		BigInteger bi2 = BigInteger.probablePrime(12, new Random());
		
		Boolean value = Boolean.valueOf(false); 
		//metoda statica ce intoarce o instanta a unui obiect deja definit, nu creaza alt obiect
		
		b.deposit(50);
		
		System.out.println(b.toString());
		
		//SINGLETON
		//Elvis elvis=Elvis.theTrueElvis;
		Elvis elvis=Elvis.getInstance();
		elvis.sing();
		
		Elvis elvis2=Elvis.getInstance();
		System.out.println(elvis==elvis2); //verificare pt modificare getInstance cu return new Elvis()
		
		ElvisV2 elvisV2=ElvisV2.INSTANCE; //cu enum
		elvisV2.sing();
	}

}
