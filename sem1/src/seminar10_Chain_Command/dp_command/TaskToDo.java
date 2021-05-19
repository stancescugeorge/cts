package seminar10_Chain_Command.dp_command;

public class TaskToDo extends TaskAsincron { //comanda concreta
	
	//referinta catre modulJoc
	InterfataModulJoc modulJoc = null;
	String info; //starea (poate fi server, ip server etc in fct de ctxt)
	int prioritate;

	public TaskToDo(InterfataModulJoc modulJoc, String info, int prioritate) {
		super();
		this.modulJoc = modulJoc;
		this.info = info;
		this.prioritate=prioritate;
	}

	@Override
	public void executaTask() {
		if(this.modulJoc!=null){
			this.modulJoc.executaActiune(info);
		} else 
			throw new UnsupportedOperationException();
	}

}
