package seminar7_Factory_Facade.dp_factoryMethod;

import seminar7_Factory_Facade.dp_simpleFactory.SuperErouAbstract;
import seminar7_Factory_Facade.dp_simpleFactory.TipErou;

public abstract class FactoryAbstract {

	public abstract SuperErouAbstract getSuperErou(TipErou tip, String nume);
}
