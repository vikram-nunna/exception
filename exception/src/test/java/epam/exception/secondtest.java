package epam.exception;

import static org.junit.Assert.*;
import org.junit.Test;

public class secondtest {

second t=new second();
    
	@Test
	public void testCost() {
		assertEquals(250000.0,t.cost("high standard material" , 100, "fully automated home"),0);
		assertEquals(400000.0,t.cost("StandardMaterials",25,"not"),0);
		assertEquals(437500.0,t.cost("above standard materials",26,"not"),0);
		assertEquals(617500.0,t.cost("high standard",100,"not"),0);
}
