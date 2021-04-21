package seminar9_Proxy_Strategy_State.dp_strategy;

public class ProfilPlayer {
	String username;
	double playTime; // cat s-a jucat
	int nrNiveluri;

	InterfataBonus strategieBonus = null;

	public ProfilPlayer(String username, double playTime, int nrNiveluri) {
		super();
		this.username = username;
		this.playTime = playTime;
		this.nrNiveluri = nrNiveluri;
	}

	// metoda f imp STRATEGY, permite modificarea strategiei
	public void setStrategieBonus(InterfataBonus strategie) {
		this.strategieBonus = strategie;
	}

	// metoda care se modifica in fct de perioada anului etc. 
	// o vom implementaextern
	public void getBonus() {
		if (this.strategieBonus != null) {
			int puncteBonus = this.strategieBonus.getPuncteBonus(this);
			System.out.println("Ai primit puncte bonus = " + puncteBonus);
		} else {
			throw new UnsupportedOperationException();
		}
	}
}
