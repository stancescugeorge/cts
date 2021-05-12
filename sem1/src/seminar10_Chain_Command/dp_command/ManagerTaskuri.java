package seminar10_Chain_Command.dp_command;

import java.util.ArrayList;

public class ManagerTaskuri {
	
	ArrayList<TaskAsincron> taskuri = new ArrayList<>();
	
	public void adaugaTask(TaskAsincron task) {
		taskuri.add(task);
	}
	
	//metoda pt simularea executiei taskurilor (in realitate, taskurile se executa pe thread-uri separate
	public void executaTask() {
		if(taskuri.size()>0) {
			TaskAsincron task=taskuri.get(0);
			task.executaTask();
			taskuri.remove(0);
		}
	}

}
