package seminar11_Observer_Memento.dp_memento;

public class TestMemento {

	public static void main(String[] args) {
		
		CaracterJoc superman = new CaracterJoc("Superman", 100, "zboara");
		
		MementoCarcaterJoc salvareInceputJoc = superman.salvare();
		
		superman.ataca();
		superman.seVindeca(100);
		System.out.println("Puncte viata: "+superman.puncteViata);
		
		superman.incarcaSalvare(salvareInceputJoc);
		
		System.out.println("Puncte viata: "+superman.puncteViata);
	}

}
