package seminar10_Chain_Command.dp_command;

public class ModulUpdateClient implements InterfataModulJoc {

	@Override
	public void executaActiune(String numeActiune) {
		System.out.println("Update client joc. Detalii: "+numeActiune);
	}

}
