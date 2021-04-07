package seminar7_Factory_Facade.dp_factoryMethod;

import seminar7_Factory_Facade.dp_simpleFactory.CaracterDCComics;
import seminar7_Factory_Facade.dp_simpleFactory.CaracterDisney;
import seminar7_Factory_Facade.dp_simpleFactory.CaracterMarvel;
import seminar7_Factory_Facade.dp_simpleFactory.SuperErouAbstract;
import seminar7_Factory_Facade.dp_simpleFactory.TipErou;

public class FactoryTemaFantasy extends FactoryAbstract {

	@Override
	public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
		SuperErouAbstract superErou=null;
		switch(tip) {
		case DISNEY:
			superErou=new CaracterFantasyDisney(nume, 100);
			break;
		case MARVEL:
			superErou=new CaracterFantasyMarvel(nume, 500);
			break;
		case DC:
			superErou=new CaracterFantasyDCComics(nume, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}	
		return superErou;
	}

}
