//package Ciphers;
//import org.junit.jupiter.api.Test;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//
//import static org.junit.jupiter.api.Assertions.*;
//public class RailTest {
//		private EncryptRail testRail;
//		private DecryptRail testRailDecryption;
//
//
//	    @Test
//	    void testOutput() {
//	    	testRail = new EncryptRail();
//	    	testRailDecryption = new DecryptRail();
//	    	String tester = "Hello World";
//	    	assertEquals("HOLEL WRDLO ", testRail.encipher(tester, 3));
//	    	tester = "HOLEL WRDLO ";
//	    	assertEquals("HELLO WORLD ", testRailDecryption.decipher(tester, 3));
//	    	tester = "Output with nu43mbers and pe.riods";
//	    	assertEquals("OUTMS POUPT IHUBR ADEID TWNEN RS", testRail.encipher(tester, 3));
//	    	tester = "OUTMS POUPT IHUBR ADEID TWNEN RS ";
//	    	assertEquals("OUTPU TWITH NUMBE RSAND PERIO DS", testRailDecryption.decipher(tester, 3));
//	    }
//
//	}
//
//
