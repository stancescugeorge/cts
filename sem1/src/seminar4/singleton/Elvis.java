package seminar4.singleton;

public class Elvis {
	//public final static Elvis theTrueElvis=new Elvis(); //final - constanta ca sa nu fie suprascrisa proprietatea
	//private final static Elvis theTrueElvis=new Elvis(); // renuntam la instantiere si o tratam in getInstance
	private static Elvis theTrueElvis;
	
	private Elvis() {
	
	}
	
	public static Elvis getInstance() {
		//synchronized (Elvis.class) {	//pt multithreading, momentan nu e cazul
			if(theTrueElvis==null)
				theTrueElvis=new Elvis(); //lazy loading - instantiem obiectul doar daca avem nevoie de el
		//}
		
		return theTrueElvis; //folosim metoda pt cazul in care realizam ca nu avemc nevoie de singleton 
		// putem inlocui cu return new Elvis() dc avem nevoie de instante diferite ale clasei
	}
	
	public void sing() {
		System.out.println("Elvis is singing");
	}
}
