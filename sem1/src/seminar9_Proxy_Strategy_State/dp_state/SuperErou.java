package seminar9_Proxy_Strategy_State.dp_state;

public class SuperErou {
	
	public static final int NIVEL_CRITIC=10;
	
	String nume;
	int puncteViata;
	
	InterfataMiscare modMiscare = null;
	
	public SuperErou(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		
		this.modMiscare=new MiscareNormala(); //atasare stare initiala
	}

	void seDeplaseaza() {
		this.modMiscare.seDeplaseaza();
	}

	void esteAtacat(int puncte) {
		this.puncteViata-=puncte;
		if(this.puncteViata<NIVEL_CRITIC) {
			this.modMiscare=new MiscareModRanit(); //obiectul isi modifica starea (strategia) singur
		}
	}
	
	void seVindeca(int puncte) {
		this.puncteViata+=puncte;
		if(this.puncteViata>=NIVEL_CRITIC) {
			this.modMiscare=new MiscareNormala(); //obiectul isi modifica starea singur
		}
	}
}
