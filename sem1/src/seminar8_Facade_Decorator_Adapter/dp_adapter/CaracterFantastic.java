package seminar8_Facade_Decorator_Adapter.dp_adapter;

public class CaracterFantastic extends ACMECaracterJoc {

	public CaracterFantastic(String nume, int puncteViata) {
		super(nume, puncteViata);
	}

	@Override
	public void seDeplaseaza() {
		System.out.println(String.format("%s se deplaseaza pe ecran",nume));
	}

	@Override
	public void esteLovit(int puncte) {
		this.puncteViata-=puncte;
		System.out.println(String.format("%s este lovit si pierde %d puncte"
				,nume,puncte));
		System.out.println("Puncte viata ramase: "+this.puncteViata);
	}

	@Override
	public void seVindeca(int puncte) {
		this.puncteViata+=puncte;
		System.out.println(String.format("%s se vindeca si recupereaza %d puncte"
				,nume,puncte));

	}

}
