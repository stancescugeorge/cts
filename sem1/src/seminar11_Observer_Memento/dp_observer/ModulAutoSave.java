package seminar11_Observer_Memento.dp_observer;

public class ModulAutoSave implements InterfataStatusConexiune {

	@Override
	public void notificarePierdereConexiune() {
		System.out.println("Salvare automata joc");
	}

}
