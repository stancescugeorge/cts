package seminar10_Chain_Command.dp_chain;

public class ModulChatPrivat extends NodChainAbstract{
	
	public static final String NUME_MODUL="Modul Chat Privat"; //nume unic 

	public ModulChatPrivat() {
		super(NUME_MODUL);
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		
		if(mesaj.getDestinatie().isEmpty()||mesaj.getDestinatie().equals("@Everyone")) {
			//este mesaj de broadcast, il trimitem mai departe
			if(this.next!=null) {
				this.next.procesareMesajChat(mesaj);
			} 
		} else {
			//procesare mesaj privat (NU il trimit mai departe)
			System.out.println(String.format("Mesaj privat pentru %s = %s",
					mesaj.getDestinatie(),mesaj.getContinut()));
		}
	}

}
