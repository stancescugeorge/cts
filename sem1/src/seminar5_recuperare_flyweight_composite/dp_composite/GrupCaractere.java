package seminar5_recuperare_flyweight_composite.dp_composite;

import java.util.ArrayList;

public class GrupCaractere extends NodAbstractStructura { //clasa composite din diagrama
	
	ArrayList<NodAbstractStructura> noduri=new ArrayList<>(); //eager instantiation 
	String denumire;
	
	public GrupCaractere(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void atacaJucator(String numeJucator) { // toate caracterele din grup ataca numeJucator
		for(NodAbstractStructura nod:noduri) {
			nod.atacaJucator(numeJucator);
		}	
	}

	@Override
	public void seRetrage() {
		for(NodAbstractStructura nod:noduri) {
			nod.seRetrage();
		}	
	}

	@Override
	public void seDeplaseaza() { //nu are sens pentru grup
		throw new UnsupportedOperationException();
	}

	@Override
	public void adaugaNod(NodAbstractStructura nod) {
		this.noduri.add(nod);
	}

	@Override
	public void stergeNod(NodAbstractStructura nod) {
		this.noduri.remove(nod);
	}

	@Override
	public NodAbstractStructura getNod(int index) { //intoarce null daca indexul e incorect
		return this.noduri.get(index);
	}

}
