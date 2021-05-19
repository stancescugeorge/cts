package seminar8_Facade_Decorator_Adapter.dp_decorator;

import seminar8_Facade_Decorator_Adapter.dp_adapter.ACMECaracterJoc;

public class DecoratorScut extends DecoratorCaracter {
	
	int nivelScut;

	public DecoratorScut(ACMECaracterJoc caracter, int nivel) {
		super(caracter);
		this.nivelScut=nivel;
	}

	@Override
	public void esteLovit(int puncte) {
		int puncteLovitura = puncte-this.nivelScut;
		if(puncteLovitura > 0) {
			this.caracter.esteLovit(puncteLovitura);
		}
	}
	
	

}
