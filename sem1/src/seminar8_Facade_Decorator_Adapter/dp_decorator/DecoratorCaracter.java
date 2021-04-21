package seminar8_Facade_Decorator_Adapter.dp_decorator;

import seminar8_Facade_Decorator_Adapter.dp_adapter.ACMECaracterJoc;

public abstract class DecoratorCaracter extends ACMECaracterJoc { //abstract - pt ca este un decorator generic, nu trebuie instantiat
	
	ACMECaracterJoc caracter = null; //referinta catre obiectul decorat

	public DecoratorCaracter(ACMECaracterJoc caracter) {
		super(caracter.getNume(), caracter.getPuncteViata());
		this.caracter = caracter;
	}

	@Override
	public void seDeplaseaza() {
		caracter.seDeplaseaza();
		
	}

	@Override
	public void esteLovit(int puncte) {
		caracter.esteLovit(puncte);
		
	}

	@Override
	public void seVindeca(int puncte) {
		caracter.seVindeca(puncte);
	}
	
	

}