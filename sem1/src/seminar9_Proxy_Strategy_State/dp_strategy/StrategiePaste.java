package seminar9_Proxy_Strategy_State.dp_strategy;

public class StrategiePaste implements InterfataBonus {

	@Override
	public int getPuncteBonus(ProfilPlayer player) {
		if(player.playTime>50) {
			return 50;
		} else {
			return 0;
		}
	}

}
