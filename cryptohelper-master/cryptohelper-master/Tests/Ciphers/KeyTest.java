import static org.junit.Assert.*;

import org.junit.Test;

public class KeyTest {
	Key m = new Key();
	@Test
	public void creationTest() {
		assertNotNull(m);
	}
	@Test
	public void keyCreationTest(){
		int[][] m1 = new int [2][2];
		Key m = new Key();
		m1 = m.getKey();
		assertArrayEquals(m1, m.getKey());
	}
	@Test
	public void inverseCreationTest(){
		int[][]i1 = new int [2][2];
		i1 = m.getKeyInverse();
		assertArrayEquals(i1, m.getKeyInverse());
	}

}
