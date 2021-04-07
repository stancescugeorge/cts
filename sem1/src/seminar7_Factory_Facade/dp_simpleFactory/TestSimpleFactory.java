package seminar7_Factory_Facade.dp_simpleFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
//		SuperErouAbstract supererou = 
//				new CaracterDisney("Mickey Mouse",100,false);
//		supererou=new CaracterMarvel("Spiderman", 150, 50);
//		supererou=new CaracterDCComics("Batman", 150);
		
		boolean selectieTemaUniversala = true;
		SuperErouAbstract superCaracter = null;
		
		//simple factory
		if(selectieTemaUniversala) {
			superCaracter = 
					FactorySuperErou.getSuperErou(TipErou.DISNEY,"Mickey Mouse");
			superCaracter = FactorySuperErou.getSuperErou(TipErou.MARVEL, "Spiderman");
			superCaracter=FactorySuperErou.getSuperErou(TipErou.DC, "Batman");
		} 
		else {
			// ... vrem sa evitam if-urile, folosim factory method
		}
	}

}
