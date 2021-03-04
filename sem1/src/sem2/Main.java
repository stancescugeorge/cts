package sem2;

public class Main {
	public static void main(String[] args) {
		CalendarUtil cu=new CalendarUtil(); 
		
		System.out.println(cu.weekDay(3));
		System.out.println(cu.weekDay2(3)); 
		
		try {
			System.out.println(cu.weekDay3(3));
			System.out.println(cu.weekDay4(3));
		} catch (IncorectDayException e) {
			System.out.println(e.getMessage());
		}
	}
}
