package binary;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryMoreTests
{	
	@Test
	public void test_constructor_InvalidInputs_NullString_ThrowsException( ) {
		try {
			Binary test = new Binary(null);
			fail("Supposed to catch NullPointerException");
		} catch ( NullPointerException npe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch NullPointerException");
		}
	}
}
