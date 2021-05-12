package seminar11_Observer_Memento.dp_memento;

import java.util.Date;

//MEMENTO conserva doar starea obiectului (atributele), nu si comportamentul (metodele)
public class MementoCarcaterJoc {
	String denumire;
	int puncteViata;
	String abilitatiMagice;
	
	Date momentSalvare;
	
	public MementoCarcaterJoc(String denumire, int puncteViata, String abilitatiMagice) {
		super();
		this.denumire = denumire;
		this.puncteViata = puncteViata;
		this.abilitatiMagice = abilitatiMagice;
		momentSalvare=new Date();
	}
}
