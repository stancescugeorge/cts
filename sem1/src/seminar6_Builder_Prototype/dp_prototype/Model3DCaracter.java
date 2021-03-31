package seminar6_Builder_Prototype.dp_prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3DCaracter implements Cloneable { //In Java, este ca o afirmatie ce arata ca supradefinesc Clone pt deep copy
	
	String culoare;
	int inaltime;
	
	ArrayList<Integer> puncte = new ArrayList<>(); //eager (construiesti de la inceput colectia, de preferat) vs lazy (instantiezi atributul mai tarziu)
	
	public Model3DCaracter(String culoare) {
		this.culoare=culoare;
		
		System.out.println("Incarcare model 3D din fisier ...");
		try {
			Thread.sleep(2000);
			
			Random random=new Random(10);
			
			for(int i = 0; i< 20; i++) {
				this.puncte.add(random.nextInt(1000));
			}
			
			System.out.println("Model 3D generat");
			
		} catch (InterruptedException e) {
		}
	}
	
	private Model3DCaracter() {
	}

	@Override
	public Object clone() throws CloneNotSupportedException { //public pt a permite clonarea obiectelor
		
		//Model3DCaracter copie = new Model3DCaracter(this.culoare); //ascundem costructorul in clone, NU ne ajuta (scopul este sa il evitam)
		Model3DCaracter copie = new Model3DCaracter();
		copie.culoare = this.culoare;
		copie.inaltime = this.inaltime;
		copie.puncte = (ArrayList<Integer>) this.puncte.clone(); //colectiile deja furnizeaza clone pt deep copy
		
		return copie;
	}
	
}
