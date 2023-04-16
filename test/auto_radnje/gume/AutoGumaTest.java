package auto_radnje.gume;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AutoGumaTest {

	AutoGuma a;
	
	@BeforeEach
	 void setUp() throws Exception {
		a=new AutoGuma();
	}

	@AfterEach
	void tearDown() throws Exception {
		a=null;
	}
	
	@Test
	void testMarkaModelNull() {
		assertThrows(NullPointerException.class,()->a.setMarkaModel(null));
	}

	@Test
	void testMarkaModelManjeod3() {
		assertThrows(IllegalArgumentException.class,()->a.setMarkaModel("SA"));
	}
	
	@Test
	void testMarkaModelOk() {
		a.setMarkaModel("tigar");
		assertEquals("tigar",a.getMarkaModel());
	}
	
	@ParameterizedTest
	@CsvSource ({
		"11",
		"12",
		"25"
	})
	void testPrecnikNijeOpseg(int precnik) {
		assertThrows(IllegalArgumentException.class,()->a.setPrecnik(precnik));
	}
	
	@Test
	void testPrecnikOk() {
		a.setPrecnik(15);
		assertEquals(15, a.getPrecnik());
	}
	
	@ParameterizedTest
	@CsvSource ({
		"120",
		"134",
		"360"
	})
	void testSirinaVanOpseg(int sirina) {
		assertThrows(IllegalArgumentException.class, ()->a.setSirina(sirina));
	}
	
	@Test
	void testSirinaOk() {
		a.setSirina(150);
		assertEquals(150, a.getSirina());
	}
	
	@ParameterizedTest
	@CsvSource ({
		"20",
		"22",
		"100"
	})
	void  testVisinaVanOpseg(int visina) {
		assertThrows(IllegalArgumentException.class, ()->a.setVisina(visina));
		
	}
	
	@Test
	void testVisinaOk() {
		a.setVisina(50);
		assertEquals(50, a.getVisina());
		
	}
	
	@Test
	@DisplayName ("Test za toString metodu")
	void testToString() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		
		String s=a.toString();
		
		assertTrue(s.contains("Tigar"));
		assertTrue(s.contains("15"));
		assertTrue(s.contains("200"));
		assertTrue(s.contains("50"));
	}
	
	@ParameterizedTest
	@CsvSource({
		"tigar,tigar,15,15,200,200,50,50,true",
		"tigar,tigar,15,15,200,200,50,49,false",
		"tigar,tigar,15,15,200,199,50,50,false",
		"tigar,tigar,15,14,200,200,50,50,false",
		"tigar,mamba,15,15,200,200,50,50,false"
	})
	void testEqualsIsti(String ime1,String ime2,int precnik1,int precnik2,int sirina1,int sirina2,int visina1,int visina2,boolean isti) {
		a.setMarkaModel(ime1);
		a.setPrecnik(precnik1);
		a.setSirina(sirina1);
		a.setVisina(visina1);
		
		AutoGuma a2=new AutoGuma(ime2, precnik2, sirina2, visina2);
		assertEquals(isti, a.equals(a2));
	}
	
	@Test
	void equalsNull() {
		assertFalse(a.equals(null));
	}
	
	@Test
	void equalsIsti() {
		assertTrue(a.equals(a));
	}
	
	
}
