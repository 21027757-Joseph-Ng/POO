import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	@BeforeClass
	public static void setUpClass() {
		
	}
	
	@Before
	public void setUp() throws Exception {
	}	

	@Test
	public void addTestC() {
		//common test add method
		int int1 = 234;
		int int2 = 432;
		
		int expected = 666;
		Calculate cal = new Calculate();
		
		int result = cal.add(int1, int2);
		
        assertEquals(result, expected);
	}
	
	@Test
	public void addTestB() {
		//boundary test add method
		int int1 = 32767;
		int int2 = 1;
		
		int expected = 32768;
		Calculate cal = new Calculate();
		
		int result = cal.add(int1, int2);
		
        assertEquals(result, expected);
	}
	
	@Test
	public void addTestE() {
		//error test add method
		int int1 = 32767;
		int int2 = 2;
		
		int expected = 32769;
		Calculate cal = new Calculate();
		
		int result = cal.add(int1, int2);
		
        assertNotEquals(result, expected);
	}
	
	@Test
	public void substractTestC() {
		//common test substract method
		int int1 = 234;
		int int2 = 432;
		
		int expected = -198;
		Calculate cal = new Calculate();
		
		int result = cal.substract(int1, int2);
		
        assertEquals(result, expected);
	}
	
	@Test
	public void substractTestB() {
		//boundary test substract method
		int int1 = -1;
		int int2 = 32767;
		
		int expected = -32768;
		Calculate cal = new Calculate();
		
		int result = cal.substract(int1, int2);
		
        assertEquals(result, expected);
	}
	
	@Test
	public void substractTestE() {
		//error test substract method
		int int1 = -200;
		int int2 = 32768;
		
		int expected = -32968;
		Calculate cal = new Calculate();
		
		int result = cal.substract(int1, int2);
		
        assertNotEquals(result, expected);
	}
	
	@Test
	public void multipleTestC() {
		//common test multiple method
		int int1 = 120;
		int int2 = 15;
		
		int expected = 1800;
		Calculate cal = new Calculate();
		
		int result = cal.multiple(int1, int2);
		
        assertEquals(result, expected);
	}
	
	@Test
	public void multipleTestB() {
		//boundary test multiple method
		int int1 = 8;
		int int2 = 4096;
		
		int expected = 32768;
		Calculate cal = new Calculate();
		
		int result = cal.multiple(int1, int2);
		
        assertEquals(result, expected);
	}
	
	@Test
	public void multipleTestE() {
		//error test multiple method
		int int1 = 16;
		int int2 = 4096;
		
		int expected = 65536;
		Calculate cal = new Calculate();
		
		int result = cal.multiple(int1, int2);
		
        assertNotEquals(result, expected);
	}
	
	@Test
	public void devideTestC() {
		//common test devide method
		double dol1 = 120;
		double dol2 = 15;
		
		double expected = 8;
		Calculate cal = new Calculate();
		
		double result = cal.devide(dol1, dol2);

        assertEquals(expected, result, 0);
	}
	
	@Test
	public void devideTestB() {
		//boundary test devide method
		double dol1 = 0.001;
		double dol2 = 0.000001;
		
		double expected = 1000;
		Calculate cal = new Calculate();
		
		double result = cal.devide(dol1, dol2);
		
		System.out.println(result);
        assertEquals(expected, result, 0);
	}
	
	@Test
	public void devideTestE() {
		//error test devide method
		double dol1 = 120;
		double dol2 = 0;
		
		double expected = 2147483647;
		Calculate cal = new Calculate();
		
		double result = cal.devide(dol1, dol2);

        assertNotEquals(expected, result, 0);
	}
	
	
	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() {
		
	}
}
