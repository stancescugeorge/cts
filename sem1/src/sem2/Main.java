package sem2;

import solid.BankAccount;
import solid.Person;

public class Main {
	public static void main(String[] args) {
//		CalendarUtil cu=new CalendarUtil(); 
//		System.out.println(cu.weekDay2(3)); 
//		
//		try {
//			System.out.println(cu.weekDay(3));
//			System.out.println(cu.weekDay3(3));
//			System.out.println(cu.weekDay4(3));
//		} catch (IncorectDayException e) {
//			System.out.println(e.getMessage());
//		}
		
		Person p=new Person("George");
		BankAccount account = new BankAccount("INGB123242342",p);
	}
}
