package seminar5_recuperare_flyweight_composite.dp_composite;

public abstract class NodAbstractStructura implements InterfataCaractereNPC { //componentaAbstracta din diagrama

	public abstract void adaugaNod(NodAbstractStructura nod); //putem defini metodele  fara abstract + throw uunsupportedOperation (vezi ex. curs)
	public abstract void stergeNod(NodAbstractStructura nod);
	public abstract NodAbstractStructura getNod(int index);
}
