package seminar11_Observer_Memento.dp_observer;

public class ModulNotificareJucator implements InterfataStatusConexiune {

	@Override
	public void notificarePierdereConexiune() {
		System.out.println("Pop UP! Conexiune internet pierduta!");
	}

}
