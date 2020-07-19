package epam.exception;
import static org.junit.Assert.*;
import org.junit.Test;


public class firsttest {
	private static final double DELTA = 1e-15;
    first t=new first();
    
    
    
	@Test
	public void testSimple() {
		assertEquals(60.0,t.simple(100.0,2.1,3.1),DELTA);
	}
	

	@Test
	public void testCompound() {
		assertEquals(2.0,t.compound(1000.0, 2.1, 1.1),DELTA);
	}

}
