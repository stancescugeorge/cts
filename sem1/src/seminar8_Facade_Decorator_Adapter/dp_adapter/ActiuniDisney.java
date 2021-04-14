package seminar8_Facade_Decorator_Adapter.dp_adapter;

public interface ActiuniDisney { //librariile sunt complementare (exista asemanari intre ActiuniDisney si ACMECaracterJoc)
	
	public String getNume(); //metode pentru a obliga crearea unor atribute in clasele care implementeaza interfata
	public int getPower(); // la clasa abstracta atributele obligatorii sunt mostenite 
	
	public void move(int x, int y);
	public void primesteLovitura(int power);
	public void reincarca(int power);
	public void jump();
}
