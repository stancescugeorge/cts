package seminar7_Factory_Facade.dp_factoryMethod;

import seminar7_Factory_Facade.dp_simpleFactory.FactorySuperErou;
import seminar7_Factory_Facade.dp_simpleFactory.SuperErouAbstract;
import seminar7_Factory_Facade.dp_simpleFactory.TipErou;

public class TestFactoryMethod {

	public static void main(String[] args) {
		boolean esteTemaFantasy =true;
		
		FactoryAbstract factoryCarcatere=null;
		
		if(esteTemaFantasy) {
			factoryCarcatere=new FactoryTemaFantasy();
		} else {
			factoryCarcatere=new FactoryTemaUniversala();
		}
		
		SuperErouAbstract superCaracter = 
				factoryCarcatere.getSuperErou(TipErou.DISNEY,"Mickey Mouse");
		superCaracter = factoryCarcatere.getSuperErou(TipErou.MARVEL, "Spiderman");
		superCaracter=factoryCarcatere.getSuperErou(TipErou.DC, "Batman");
	}

}
