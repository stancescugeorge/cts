package seminar8_Facade_Decorator_Adapter.dp_decorator;

import seminar8_Facade_Decorator_Adapter.dp_adapter.ACMECaracterJoc;
import seminar8_Facade_Decorator_Adapter.dp_adapter.CaracterFantastic;

public class TestDecorator {

	public static void main(String[] args) {
		ACMECaracterJoc dragon=new CaracterFantastic("Dragonul albastru", 1000);
		dragon.seDeplaseaza();
		dragon.esteLovit(200);
		dragon.seVindeca(100);
		
		//ACMECaracterJoc dragonCuScut = new DecoratorScut(dragon, 200);
		//dragonCuScut.esteLovit(300);
		
		dragon=new DecoratorScut(dragon, 200);
		dragon.esteLovit(300);
		
		//decortorii pot fi aplicati in cascada!
		dragon=new DecoratorRanit(dragon);
		dragon.esteLovit(400);
		dragon.seDeplaseaza();
		dragon.esteLovit(500);
		dragon.seDeplaseaza(); //? e o problema cu decoratorRanit
	}

}
