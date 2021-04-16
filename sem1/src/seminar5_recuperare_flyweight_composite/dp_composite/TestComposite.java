package seminar5_recuperare_flyweight_composite.dp_composite;

public class TestComposite {

	public static void main(String[] args) {
		
		GrupCaractere grup1=new GrupCaractere("Grup 1");
		grup1.adaugaNod(new CaracterNPC("Soldat 1", 100));
		grup1.adaugaNod(new CaracterNPC("Soldat 2", 100));
		
		GrupCaractere grup2=new GrupCaractere("Grup 2");
		grup2.adaugaNod(new CaracterNPC("Soldat 3", 200));
		grup2.adaugaNod(new CaracterNPC("Tanc", 500));
		
		GrupCaractere grupNivelJoc=new GrupCaractere("Level 2");
		grupNivelJoc.adaugaNod(new CaracterNPC("Level Boss", 1000));
		grupNivelJoc.adaugaNod(grup1);
		grupNivelJoc.adaugaNod(grup2);
		
		grupNivelJoc.atacaJucator("Superman");
		grupNivelJoc.seRetrage();
		grupNivelJoc.getNod(0).seDeplaseaza(); //deplaseaza Boss, e recomandat un HashMap in loc de ArrayList ca sa nu mai numaram
	}

}
