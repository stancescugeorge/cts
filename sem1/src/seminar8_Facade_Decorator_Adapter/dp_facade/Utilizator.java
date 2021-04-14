package seminar8_Facade_Decorator_Adapter.dp_facade;

public class Utilizator {
	public void login(String userName, String password) {
		System.out.println("Login");
	}
	
	public ProfilJucator getProfil() {
		return new ProfilJucator();
	}

}
