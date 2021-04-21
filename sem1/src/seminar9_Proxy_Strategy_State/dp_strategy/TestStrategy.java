package seminar9_Proxy_Strategy_State.dp_strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ProfilPlayer player = new ProfilPlayer("Superman", 60, 5);
		player.setStrategieBonus(new StrategiePaste());
		player.getBonus();

		player.setStrategieBonus(new StrategieCraciun());
		player.getBonus();

		// strategie ad-hoc, merge cand avem interfata cu 1-2 metode, NU cu mai multe (clean code)
		player.setStrategieBonus(new InterfataBonus() {
			@Override
			public int getPuncteBonus(ProfilPlayer player) {
				if (player.nrNiveluri > 3)
					return 30;
				else
					return 0;

			}
		});
		player.getBonus();

	}
}
