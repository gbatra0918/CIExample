package CS_348_SP_2016.CIExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class EndsWith2Test {

	@Test
	public void testToString() {
		EndsWith2 two = new EndsWith2();
		assertEquals("EndsWith2 [names=Karl Wurst\nLoukas Mironidis\nSaif Jweda\n]", two.toString());
	}

}
