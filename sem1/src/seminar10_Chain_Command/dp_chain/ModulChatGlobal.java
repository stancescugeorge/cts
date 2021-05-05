package seminar10_Chain_Command.dp_chain;

public class ModulChatGlobal extends NodChainAbstract {

	public ModulChatGlobal() {
		super("Modul Chat Global");
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		if(mesaj.getDestinatie().isEmpty()||mesaj.getDestinatie().equals("@Everyone")) {
			System.out.println("Mesaj catre toti jucatorii: "+ mesaj.getContinut());
		}
		
		//trimit even (mesajul) mai departe indiferent de procesare
		if(this.next!=null) {
			this.next.procesareMesajChat(mesaj);
		}
	}

}
