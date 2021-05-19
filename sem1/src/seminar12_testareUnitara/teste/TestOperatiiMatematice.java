package seminar12_testareUnitara.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import seminar12_testareUnitara.exceptii.ExceptieImpartireLaZero;
import seminar12_testareUnitara.modele.OperatiiMatematice;

public class TestOperatiiMatematice {
	//se executa inaintea tuturor metodelor o singura data
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Salut");
	}

	//se executa dupa executia tuturor metodelor o singura data
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("La revedere");
	}
	
	//se executa inainte de fiecare unit test
	@Before
	public void setUp() throws Exception {
		System.out.println("Pregatire test");
	}

	//se executa dupa fiecare unit test 
	@After
	public void tearDown() throws Exception {
		System.out.println("Stergere resurse folosite");
	}

	@Test
	public void test() {
		System.out.println("Test de test");
		fail("Not yet implemented");
	}
	
	@Test //adnotare pt a marca un test (incepand cu JUnit 4)
	public void testAdunaValoriPozitive() {
		System.out.println("Test aduna");
		int a=5;
		int b=5;
		int rezultatAsteptat=10; //11
		int rezultatCalculat=OperatiiMatematice.aduna(a, b);
		
		//primul param - mesaj ce apare cand testul esueaza
		assertEquals("Suma cu numere pozitive",rezultatAsteptat,rezultatCalculat);
	}
	
	@Test
	public void testImpartireValoriPozitive() {
		int a=1;
		int b=2;
		double rezultatAsteptat=0.5;
		double rezultatCalculat=0;
		
		//pe catch punem fail pt ca testul nu testeaza exceptia
		try {
			rezultatCalculat = OperatiiMatematice.impartire(a, b);
		} catch (ExceptieImpartireLaZero e) {
			fail("Am primit exceptie desi nu trebuia");
		}
		
		assertEquals("Impartire cu numere pozitive", rezultatAsteptat, rezultatCalculat, 0.0000000000001); 
		// utlimul param e delta, care arata precizia de calcul (accept o eroare de calcul egala cu delta)
		// fol pt calcule cu nr in virgula mobila (reale)
		// ex. cu 1/3 + 1/3 + 1/3 != 1 in Computer Science
	}

	//se poate folosi coverage
}
