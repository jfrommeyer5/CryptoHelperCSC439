package Ciphers;

import static org.junit.Assert.*;

import org.junit.Test;

public class hillDecryptTest {

	@Test
	public void decryptSuccessPathTest() {
		String m = "YGPMN NMKGL IOAZ";
		String d = hillDecrypt.decrypt(m, 18,25,1,22);
		String r = "igott histo work";
		assertEquals(r,d);
	}
	
	@Test
	public void decryptFailPathTest(){
		String m = "YGPMN NMKGL IOAZ";
		String d = hillDecrypt.decrypt(m, 1,2,3,4);
		String r = "Error: Invalid Key";
		assertEquals(r,d);
	}

}
