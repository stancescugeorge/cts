package seminar5_recuperare_flyweight_composite.dp_flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		
		ContextEcran contextCladire1=new ContextEcran(100, 50, "albastru");
		ContextEcran contextCladire2=new ContextEcran(200, 100, "albastru");
		ContextEcran contextCladire3=new ContextEcran(200, 350, "rosu");
		
		InterfataModel3D modelCladire = FactoryModel3D.getModel3d("Cladire");
		modelCladire.afisareEcran(contextCladire1);
		modelCladire.afisareEcran(contextCladire2);
		modelCladire.afisareEcran(contextCladire3);
		
	}

}
