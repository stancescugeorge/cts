package seminar8_Facade_Decorator_Adapter.dp_adapter;

public class AdaptorDisneyLaACME extends ACMECaracterJoc {
	
	ActiuniDisney caracterDisney=null;

	public AdaptorDisneyLaACME(ActiuniDisney caracterDisney) { //eliminam constructorul default (nu are sens sa instantiem un adaptor fara obiectul pe care il adapteaza)
		super(caracterDisney.getNume(), caracterDisney.getPower());
		this.caracterDisney = caracterDisney;
	}

	@Override
	public void seDeplaseaza() {
		caracterDisney.move(0,0);
	}

	@Override
	public void esteLovit(int puncte) {
		caracterDisney.primesteLovitura(puncte);
	}

	@Override
	public void seVindeca(int puncte) {
		caracterDisney.reincarca(puncte);
	}
	
	
}
