package seminar11_Observer_Memento.dp_observer;

import java.util.ArrayList;

//sarim peste nivelul abstract observabil din diagrama (comasam observabil cu observabilConcret)
public class ModulConexiuneInternet {
	
	ArrayList<InterfataStatusConexiune> module = new ArrayList<>();
	
	public void registerModul(InterfataStatusConexiune modul) {
		module.add(modul);
	}
	
	public void unregisterModul(InterfataStatusConexiune modul) {
		module.remove(modul);
	}
	
	public void pierdereConexiune() {
		for(InterfataStatusConexiune modul:module) {
			modul.notificarePierdereConexiune();
		}
	}
}
