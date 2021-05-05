package seminar10_Chain_Command.dp_command;

public class TestCommand {

	public static void main(String[] args) {
		TaskAsincron autoSave=new TaskToDo(new ModulAutoSave(), "Autosave", 5);
		TaskAsincron autoUpdate=new TaskToDo(new ModulUpdateClient(), "Update v2", 20); //trebuie salvate in managerul de task-uri asincrone
		
		//un alt thread parcurge lista de task-uri din manager si le executa in fct de prioritate, ordine etc.
		autoSave.executaTask(); //in mod normal task-urile se executa in paralel pe alt thread 
		autoUpdate.executaTask();
	}

}
