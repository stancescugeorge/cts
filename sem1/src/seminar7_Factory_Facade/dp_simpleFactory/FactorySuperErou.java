package seminar7_Factory_Facade.dp_simpleFactory;

public class FactorySuperErou {
	
	public static SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		//nu e obligatoriu sa avem nevoie de alti param in afara de tip
		SuperErouAbstract superErou = null;
		switch(tip) {
		case DISNEY:
			superErou=new CaracterDisney(nume, 100, false);
			break;
		case MARVEL:
			superErou=new CaracterMarvel(nume, 500, 0);
			break;
		case DC:
			superErou=new CaracterDCComics(nume, 500, 100);
			break;
		default:
			throw new UnsupportedOperationException(); // nu e oblig, dar poate modificam enum-ul
		}	
		return superErou;
	}

}
