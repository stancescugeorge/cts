package seminar8_Facade_Decorator_Adapter.dp_adapter;

public class DonaldDuck implements ActiuniDisney {
	
	public static final String denumire="Donald Duck";
	int power;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public static String getDenumire() {
		return denumire;
	}
	
	@Override
	public String getNume() {
		return denumire;
	}


	@Override
	public void move(int x, int y) {
		System.out.println("Repozitionare caracter la noile coordonate");
	}

	@Override
	public void primesteLovitura(int power) {
		this.power-=power;
		System.out.println("Nivel putere scade la "+ this.power);
	}

	@Override
	public void reincarca(int power) {
		this.power+=power;
		System.out.println("Nivel putere reincarcat la "+ this.power);
	}

	@Override
	public void jump() {
		System.out.println("Jump");
	}

	
}
