package seminar7_Factory_Facade.dp_simpleFactory;

public abstract class SuperErouAbstract {
	
	String nume;
	int puncteViata;
	
	
	public SuperErouAbstract(String nume, int puncteViata) {
		super(); //nu e obligatoriu, compilatorul oricum face apelul
		this.nume = nume;
		this.puncteViata = puncteViata;
	}

	public abstract void seDeplaseaza();
}
