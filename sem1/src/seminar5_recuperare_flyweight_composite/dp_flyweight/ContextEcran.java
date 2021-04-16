package seminar5_recuperare_flyweight_composite.dp_flyweight;

public class ContextEcran { // pt a gestiona starea temporara
	int x;
	int y;
	String culoareTextura;
	public ContextEcran(int x, int y, String culoareTextura) {
		super();
		this.x = x;
		this.y = y;
		this.culoareTextura = culoareTextura;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String getCuloareTextura() {
		return culoareTextura;
	}
	
	
	
}
