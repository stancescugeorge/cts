package seminar5_recuperare_flyweight_composite.dp_flyweight;

import java.util.ArrayList;

//clasa flyweight (concret)
public class Model3D implements InterfataModel3D {
	
	String descriere;
	ArrayList<Integer> puncteModel = new ArrayList<>();

	public Model3D(String descriere) {
		super();
		this.descriere = descriere;
	}

	@Override
	public void incarcaModel3D(String fisier) { // parte comuna, stare permanenta
		System.out.println(String.format("Incarcare model pentru %s din fisierul %s", descriere, fisier));
		for(int i=0; i<10; i++) { // simulam adaugare puncte
			puncteModel.add(i);
		}
	}

	@Override
	public void afisareEcran(ContextEcran context) { // pt specifica, stare temporara
		System.out.println(String.format("Afisare %s la %d,%d cu textura %s", 
				descriere, context.getX(), context.getY(), context.getCuloareTextura()));
	}

}
