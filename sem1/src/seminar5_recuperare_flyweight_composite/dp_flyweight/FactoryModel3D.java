package seminar5_recuperare_flyweight_composite.dp_flyweight;

import java.util.HashMap;

public class FactoryModel3D {
	
	static HashMap<String, InterfataModel3D> modele = new HashMap<>();
	
	// eager instantiation (cream toate modelele la inceput)
	static {
		// generam toate modelele 3D (modelele Flyweight)
		String[] listaModele=new String[] {"Soldat", "Copac", "Cladire"};
		for(String model:listaModele) {
			Model3D model3d = new Model3D(model);
			model3d.incarcaModel3D(model+".3d");
			modele.put(model, model3d);
		}
	}
	
	public static InterfataModel3D getModel3d(String tip) {
		return modele.get(tip);
	}
}
