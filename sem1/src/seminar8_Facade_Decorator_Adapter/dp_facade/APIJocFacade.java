package seminar8_Facade_Decorator_Adapter.dp_facade;

public class APIJocFacade {
	public static ProfilJucator getProfil(String ipServer, int port, 
			String numeUtilizator, String parola) {
		ServerJoc server = new ServerJoc(ipServer, port);
		if(server.conectare()) {
			Utilizator utilizator=new Utilizator();
			utilizator.login(numeUtilizator, parola);
			ProfilJucator profil=utilizator.getProfil();
			return profil;
		} else 
			return null;
	}
}
