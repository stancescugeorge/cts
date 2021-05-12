package seminar11_Observer_Memento.dp_memento;

public class CaracterJoc {
	
	String denumire;
	int puncteViata;
	String abilitatiMagice;
	
	public CaracterJoc(String denumire, int puncteViata, String abilitatiMagice) {
		super();
		this.denumire = denumire;
		this.puncteViata = puncteViata;
		this.abilitatiMagice = abilitatiMagice;
	}

	public void ataca() {
		
	}
	
	public void seVindeca(int valoare) {
		this.puncteViata+=valoare;
	}
	
	public void seDeplaseaza() {
		
	}
	
	//obiectul poate crea un memento cu starea lui si isi poate restaura starea folosind un memento
	public MementoCarcaterJoc salvare() {
		return new MementoCarcaterJoc(this.denumire, puncteViata, abilitatiMagice);
	}
	
	public void incarcaSalvare(MementoCarcaterJoc salvare) {
		this.denumire=salvare.denumire;
		this.puncteViata=salvare.puncteViata;
		this.abilitatiMagice=salvare.abilitatiMagice;
	}
}
