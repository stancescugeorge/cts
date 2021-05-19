package seminar5_recuperare_flyweight_composite.dp_composite;

public class CaracterNPC extends NodAbstractStructura { //nod frunza, tratam metodele specifice nodului cu exceptii

	String nume;
	int putere;
	
	public CaracterNPC(String numeCaracter, int putere) {
		super();
		this.nume = numeCaracter;
		this.putere = putere;
	}

	@Override
	public void atacaJucator(String numeJucator) {
		System.out.println(String.format("%s ataca pe %s", nume,numeJucator));
		
	}

	@Override
	public void seRetrage() {
		System.out.println(String.format("%s se retrage", nume));
		
	}

	@Override
	public void seDeplaseaza() {
		System.out.println(String.format("%s se deplaseaza", nume));
	}

	@Override
	public void adaugaNod(NodAbstractStructura nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void stergeNod(NodAbstractStructura nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NodAbstractStructura getNod(int index) {
		throw new UnsupportedOperationException();
	}

}
