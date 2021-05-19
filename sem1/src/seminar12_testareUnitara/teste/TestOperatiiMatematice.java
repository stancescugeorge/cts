package seminar12_testareUnitara.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import seminar12_testareUnitara.modele.OperatiiMatematice;

public class TestOperatiiMatematice {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test //adnotare pt a marca un test (incepand cu JUnit 4)
	public void testAdunaValoriPozitive() {
		int a=5;
		int b=5;
		int rezultatAsteptat=10; //11
		int rezultatCalculat=OperatiiMatematice.aduna(a, b);
		
		//primul param - mesaj ce apare cand testul esueaza
		assertEquals("Suma cu numere pozitive",rezultatAsteptat,rezultatCalculat);
	}

}
