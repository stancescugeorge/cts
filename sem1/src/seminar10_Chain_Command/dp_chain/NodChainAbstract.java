package seminar10_Chain_Command.dp_chain;

public abstract class NodChainAbstract { // Handler abstract in UML
	NodChainAbstract next=null; //referinta la urm nod 
	String numeModul;

	public void setNext(NodChainAbstract next) { //pot modifica dinamic urm handler
		this.next = next;
	}
	
	//in cazul acesta avem nevoie de context, dar nu e obligatoriu
	// facem leg intre even (mesaj) si metoda abstracta de tratare a even
	public abstract void procesareMesajChat(MesajChat mesaj);

	public NodChainAbstract(String numeModul) { //pentru next folosim set
		super();
		this.numeModul = numeModul;
	}
	
	

}
