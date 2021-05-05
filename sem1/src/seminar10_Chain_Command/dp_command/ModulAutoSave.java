package seminar10_Chain_Command.dp_command;

public class ModulAutoSave implements InterfataModulJoc { //executant in UML

	@Override
	public void executaActiune(String numeActiune) {
		System.out.println("Auto save. Detalii: "+numeActiune);
	} 

}
