package seminar11_Observer_Memento.dp_observer;

public class TestObserver {

	public static void main(String[] args) {
		
		ModulConexiuneInternet modulConexiune = new ModulConexiuneInternet(); //gestionare eveniment pierdere conexiune
		
		ModulAutoSave modulSalvare=new ModulAutoSave();
		ModulNotificareJucator modulNotificari = new ModulNotificareJucator();
		
		modulConexiune.registerModul(modulNotificari); 
		modulConexiune.registerModul(modulSalvare);
		
		modulConexiune.pierdereConexiune();
		
		modulConexiune.unregisterModul(modulSalvare);
		
		modulConexiune.pierdereConexiune();
		
	}

}
