package seminar7_Factory_Facade.dp_simpleFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
//		SuperErouAbstract supererou = 
//				new CaracterDisney("Mickey Mouse",100,false);
//		supererou=new CaracterMarvel("Spiderman", 150, 50);
//		supererou=new CaracterDCComics("Batman", 150);
		
		//simple factory
		SuperErouAbstract superCaracter = 
				FactorySuperErou.getSuperErou(TipErou.DISNEY,"Mickey Mouse");
		superCaracter = FactorySuperErou.getSuperErou(TipErou.MARVEL, "Spiderman");
		superCaracter=FactorySuperErou.getSuperErou(TipErou.DC, "Batman");
	}

}
