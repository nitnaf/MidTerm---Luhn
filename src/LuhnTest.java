import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LuhnTest {

	Luhn x = new Luhn();
	
	@Test
	public void test() {
		assertEquals(true, x.validate("8763"));
		assertEquals(false, x.validate("1111"));
	}

}
