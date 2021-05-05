package seminar10_Chain_Command.dp_chain;

public class MesajChat {
	
	String destinatie; //privat/public 
	String continut; //filtrare continut
	int prioritate;
	
	public MesajChat(String destinatie, String continut, int prioritate) {
		super();
		this.destinatie = destinatie;
		this.continut = continut;
		this.prioritate = prioritate;
	}
	
	public String getDestinatie() {
		return destinatie;
	}
	public String getContinut() {
		return continut;
	}
	public int getPrioritate() {
		return prioritate;
	}

}
