package sem2;

import solid.BankAccount;
import solid.FeeBankAccount;
import solid.InsuficientFundsException;
import solid.Person;

public class Main {
	public static void main(String[] args) {
//		CalendarUtil cu=new CalendarUtil(); 
//		
//		try {
//			System.out.println(cu.weekDay(3));
//			System.out.println(cu.weekDay2(3)); 
//			System.out.println(cu.weekDay3(3));
//			System.out.println(cu.weekDay4(3));
//		} catch (IncorectDayException e) {
//			System.out.println(e.getMessage());
//		}
		
		Person p=new Person("George");
		BankAccount account = new BankAccount("INGB123242342",p);
		
		account.deposit(100);
		try {
			account.withdraw(30);
			account.withdraw(40);
			account.withdraw(70);

		} catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}
			
		System.out.println(account.getBalance());
		
		
		account = new FeeBankAccount("INGB123123234234", p); //putem folosi variabila de tipul clasei parinte
		
		account.deposit(500);
		
		try {
			account.withdraw(100);
		} catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(account.getBalance());
	}
}
