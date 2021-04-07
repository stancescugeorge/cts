package seminar7_Factory_Facade.dp_factoryMethod;

import seminar7_Factory_Facade.dp_simpleFactory.CaracterDCComics;
import seminar7_Factory_Facade.dp_simpleFactory.CaracterDisney;
import seminar7_Factory_Facade.dp_simpleFactory.CaracterMarvel;
import seminar7_Factory_Facade.dp_simpleFactory.SuperErouAbstract;
import seminar7_Factory_Facade.dp_simpleFactory.TipErou;

public class FactoryTemaUniversala extends FactoryAbstract {

	@Override
	public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		SuperErouAbstract superErou=null;
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
