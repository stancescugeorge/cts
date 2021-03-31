package seminar6_Builder_Prototype.dp_builder;

public class SuperErou {
	
	private String nume;
	private int puncteViata;
	
	private boolean esteNegativ;
	private boolean esteRanitGrav;
	
	private InterfataArma armaStanga;
	private InterfataArma armaDreapta;
	
	private InterfataSuperputere superPutere;
	private InterfataSuperputere superSuperPutere;
	
	private SuperErou() {
		
	}

	private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
			InterfataArma armaDreapta, InterfataSuperputere superPutere, InterfataSuperputere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	public static class SuperErouBuilder { //daca nu ar fi statica, am avea nevoide de obiect SuperErou
		//String nume; // in gof avem toate atributele in builder
		//int puncteViata; // ...
		
		SuperErou supererou; //in Java, ne folosim de o instanta de supererou
		
		public SuperErouBuilder(String nume, int puncteViata) { //atribute obligatorii pentru crearea unui supererou
			this.supererou=new SuperErou(); //avem acces la constructorul privat pt ca builderul e definit in interiorul clasei
			this.supererou.nume=nume;
			this.supererou.puncteViata=puncteViata;
		}
		
		public SuperErouBuilder esteNegativ() { //metodele intorc mereu referinta la builder!
			this.supererou.esteNegativ=true;
			return this;
		}
		
		public SuperErouBuilder esteRanit() {
			this.supererou.esteRanitGrav=true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.supererou.armaStanga=arma;
			return this;
		}
		
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.supererou.armaDreapta=arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperputere superputere) {
			this.supererou.superPutere=superputere;
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperputere superSuperPutere) {
			this.supererou.superSuperPutere=superSuperPutere;
			return this;
		}
		
		public SuperErou build() {
			return this.supererou; //in Gof aici se apeleaza constructorul cu parametri si intorc instanta de supererou creata
		}
		
	}
	
		
} 
