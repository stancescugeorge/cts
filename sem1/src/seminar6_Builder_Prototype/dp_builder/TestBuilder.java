package seminar6_Builder_Prototype.dp_builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1. construiesti obiectul
		SuperErou superErou = new SuperErou();
		//2. initializare atribute
		superErou.nume="Superman";
		
		SuperErou superErou2=new SuperErou("Batman", 100, false, false, new Arma(), null, null, null);
	}

}
